DROP USER AgencyApp CASCADE;

CREATE USER AgencyApp IDENTIFIED BY Changeme0; 
ALTER USER AgencyApp QUOTA UNLIMITED ON DATA; 
ALTER USER AgencyApp QUOTA UNLIMITED ON USERS; 

GRANT CREATE SESSION TO AgencyApp WITH ADMIN OPTION; 
GRANT CONNECT TO AgencyApp; 
ALTER SESSION SET CURRENT_SCHEMA = AgencyApp; 

DROP TABLE Staff cascade constraints;
DROP TABLE Hotel cascade constraints;
DROP TABLE Contract cascade constraints;
DROP TABLE WorkHours cascade constraints;

CREATE TABLE Staff ( 
NIN varchar(8) PRIMARY KEY,
eName varchar(20) ); 

CREATE TABLE Hotel (
hotelNo varchar(3) PRIMARY KEY,
hotelLocation varchar(20) ); 

CREATE TABLE Contract ( 
contractNo varchar(5) PRIMARY KEY,
hotelNo varchar(3) ); 

CREATE TABLE WorkHours ( 
NIN varchar(8),
contractNo varchar(5),
hoursPerWeek number(3) ); 

ALTER TABLE WorkHours  ADD CONSTRAINT fk_NIN FOREIGN KEY (NIN) REFERENCES Staff(NIN);
ALTER TABLE WorkHours  ADD CONSTRAINT fk_contractNo FOREIGN KEY (contractNo) REFERENCES Contract(contractNo);
ALTER TABLE Contract  ADD CONSTRAINT fk_hotelNo FOREIGN KEY (hotelNo) REFERENCES Hotel(hotelNo);

INSERT INTO Staff (NIN, eName) VALUES ('113567WD', 'John Smith');
INSERT INTO Staff (NIN, eName) VALUES ('234111XA', 'Diane Hocine');
INSERT INTO Staff (NIN, eName) VALUES ('712670YD', 'Sarah White');

INSERT INTO Hotel (hotelNo,hotelLocation) VALUES ('H25', 'Edinburgh');
INSERT INTO Hotel (hotelNo,hotelLocation) VALUES ('H4', 'Glasgow');

INSERT INTO Contract (contractNo, hotelNo) VALUES ('C1024', 'H25');
INSERT INTO Contract (contractNo, hotelNo) VALUES ('C1025', 'H4');

INSERT INTO WorkHours (NIN, contractNo, hoursPerWeek) VALUES ('113567WD', 'C1024', 16);
INSERT INTO WorkHours (NIN, contractNo, hoursPerWeek) VALUES ('234111XA', 'C1024', 24);
INSERT INTO WorkHours (NIN, contractNo, hoursPerWeek) VALUES ('712670YD', 'C1025', 28);
INSERT INTO WorkHours (NIN, contractNo, hoursPerWeek) VALUES ('113567WD', 'C1025', 16);

CREATE VIEW vw_TotalHours
AS SELECT s.eName, SUM(wh.hoursPerWeek) AS Total_Hours
FROM WorkHours wh
JOIN Staff s ON s.NIN = wh.NIN
GROUP BY s.eName;

CREATE OR REPLACE FUNCTION Get_HoursPerWeek (
    p_eName IN varchar2,
    p_hotelLocation IN varchar2)
    RETURN number
    IS Hours_per_week number(3);
    begin
    select hoursPerWeek
    into Hours_per_week
    from WorkHours wh
    JOIN Staff s ON s.NIN = wh.NIN
    JOIN Contract c  ON c.contractNo = wh.contractNo
    JOIN Hotel h ON h.hotelNo = c.hotelNo
    WHERE s.eName = p_ename
    AND h.hotelLocation = p_hotelLocation;
    return(Hours_per_week);
    end Get_HoursPerWeek;
    /

create or replace procedure ADD_RECORD(
    p_Nin in varchar2,
    p_eName in varchar2,
    p_hotelNo in varchar2,
    p_hotelLocation in varchar2,
    p_contractNo in varchar2,
    p_hoursPerWeek in number)
as
begin
    INSERT INTO Staff (NIN, eName) VALUES (p_Nin, p_eName);
    dbms_output.put_line('New Staff Added');
    INSERT INTO Hotel (hotelNo,hotelLocation) VALUES (p_hotelNo, p_hotelLocation);
    dbms_output.put_line('New Hotel Added');
    INSERT INTO Contract (contractNo, hotelNo) VALUES (p_contractNo, p_hotelNo);
    dbms_output.put_line('New Contract Added');
    INSERT INTO WorkHours (NIN, contractNo, hoursPerWeek) VALUES (p_NIN, p_contractNo, p_hoursperweek);
    dbms_output.put_line('New Record Added');
    commit;
end ADD_RECORD;
/

create index idx_Employee_Name
on Staff(eName);

CREATE OR REPLACE TRIGGER TRG_MONITOR_HOTEL
AFTER INSERT ON Hotel
FOR EACH ROW
BEGIN
    UPDATE WorkHours 
    SET WorkHours.hoursPerWeek = 16
    WHERE WorkHours.hoursPerWeek = 0;
    dbms_output.put_line('Updated Work Hours');
    UPDATE WorkHours
    Set Workhours.contractNo = (SELECT contractNo FROM contract WHERE Contract.hotelNo IS NULL)
    WHERE WorkHours.contractNo IS NULL;
    dbms_output.put_line('Updated ContractNo');
    UPDATE Contract 
    SET Contract.hotelNo = :NEW.hotelNo 
    WHERE Contract.hotelNo IS NULL;
    dbms_output.put_line('Updated HotelNo');
END;
/
COMMIT;



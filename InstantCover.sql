DROP USER Hotelapp CASCADE;
CREATE USER Hotelapp IDENTIFIED BY Changename0;
ALTER USER Hotelapp QUOTA UNLIMITED ON DATA;
ALTER USER Hotelapp QUOTA UNLIMITED ON USERS;

GRANT CREATE SESSION TO HotelApp WITH ADMIN OPTION;
GRANT CONNECT TO Hotelapp;
ALTER SESSION SET CURRENT_SCHEMA = Hotelapp;

DROP TABLE Staff CASCADE CONSTRAINTS;
DROP TABLE Hotel CASCADE CONSTRAINTS;
DROP TABLE Contract CASCADE CONSTRAINTS;
DROP TABLE WorkHours CASCADE CONSTRAINTS;

CREATE TABLE Employees (
NIN VARCHAR(10) PRIMARY KEY,
eName VARCHAR(15));

CREATE TABLE Hotel (
hotelNo VARCHAR(5) PRIMARY KEY,
hotelLocation VARCHAR(10));

CREATE TABLE Contract (
contractNo VARCHAR(10),
hotelNo VARCHAR(5));

CREATE TABLE WorkHours (
NIN VARCHAR(10),
contractNo VARCHAR(5),
hoursPerWeek VARCHAR (5));

ALTER TABLE WorkHours ADD CONSTRAINT fk_NIN FOREIGN KEY (NIN) REFERENCES Employees(NIN);
ALTER TABLE Contract ADD CONSTRAINT fk_hotelNo FOREIGN KEY (hotelNo) REFERENCES Hotel(hotelNo);

INSERT INTO Employees (NIN, Ename) VALUES ('113567WD', 'John Smith');
INSERT INTO Employees (NIN, Ename) VALUES ('234111XA', 'Diane Hocine');
INSERT INTO Employees (NIN, Ename) VALUES ('712670YD', 'Sarah White');

INSERT INTO Hotel (hotelNo, hotelLocation) VALUES ('H25', 'Edinburg');
INSERT INTO Hotel (hotelNo, hotelLocation) VALUES ('H4', 'Glasgow');

INSERT INTO Contract (contractNo, hotelNo) VALUES ('C1024', 'H25');
INSERT INTO Contract (contractNo, hotelNo) VALUES ('C1025', 'H4');

INSERT INTO WorkHours (NIN, contractNo, hoursPerWeek) VALUES ('113567WD', 'C1024', 'H25');
INSERT INTO WorkHours (NIN, contractNo, hoursPerWeek) VALUES ('234111XA', 'C1024', 'H25');
INSERT INTO WorkHours (NIN, contractNo, hoursPerWeek) VALUES ('712670YD', 'C1025', 'H4');
INSERT INTO WorkHours (NIN, contractNo, hoursPerWeek) VALUES ('113567WD', 'C1025', 'H4');

CREATE or REPLACE VIEW Employee_Hours_Spent AS
SELECT e.eName, SUM(t.hoursPerWeek) AS Total_Hours_Per_Week FROM Employees e INNER JOIN WorkHours t ON e.NIN = t.NIN GROUP BY e.eName;
Select * FROM Employee_Hours_Spent;

CREATE INDEX idx_Employees_Ename
ON Employees(Ename);

create or replace procedure ADD_RECORD(
    p_NIN in varchar2,
    p_EName in varchar2,
    p_hotelNo in varchar2,
    p_hotelName in varchar2,
    p_contractNo in varchar2,
    p_hoursPerWeek in varchar2)
as 
begin 
    insert into Employees values (p_NIN, p_EName);
    insert into Hotel values (p_hotelNo, p_hotelLocation);
    insert into Contract values (p_contractNo, p_hotelNo);
    insert into WorkHours values (p_NIN, p_contractNo, p_hourPerWeek);
    dbms_output.put_line('new employee added');
end ADD_RECORD;
/
set serveroutput on;
execute ADD_RECORD('123456AB', 'leeane');
execute ADD_RECORD('H5, 'Secret');
execute ADD_RECORD('C1026', 'H5');
execute ADD_RECORD('123456AB', 'C1026', '24');




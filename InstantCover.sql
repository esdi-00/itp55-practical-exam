DROP USER InstantCover CASCADE; 

CREATE USER InstantCover IDENTIFIED BY Changeme0; 
ALTER USER InstantCover QUOTA UNLIMITED ON DATA; 
ALTER USER InstantCover QUOTA UNLIMITED ON USERS; 

GRANT CREATE SESSION TO InstantCover WITH ADMIN OPTION; 
GRANT CONNECT TO InstantCover; 
ALTER SESSION SET CURRENT_SCHEMA = InstantCover; 

DROP TABLE staff cascade constraints;
DROP TABLE hotel cascade constraints;
DROP TABLE contract cascade constraints;
DROP TABLE workHours cascade constraints;

CREATE TABLE staff (
NIN varchar(30) PRIMARY KEY,
eName varchar(30));

CREATE TABLE hotel ( 
hotelNo varchar(10) PRIMARY KEY,
hotelLocation varchar(50));

CREATE TABLE contract ( 
contractNo varchar(30) PRIMARY KEY,
hotelNo varchar(30));

CREATE TABLE workHours ( 
NIN varchar(30),
contractNo varchar(30),
no_hours int);

ALTER TABLE workHours  ADD CONSTRAINT fk_NIN FOREIGN KEY (NIN) REFERENCES staff(NIN);
ALTER TABLE workHours  ADD CONSTRAINT fk_contractNo FOREIGN KEY (contractNo) REFERENCES contract(ContractNo);
ALTER TABLE contract ADD CONSTRAINT fk_hotelNo FOREIGN KEY (hotelNo) REFERENCES hotel(hotelNo);

INSERT INTO Staff (NIN, eName) VALUES ('113567WD', 'John Smith');
INSERT INTO Staff (NIN, eName) VALUES ('234111XA', 'Diane Hocine');
INSERT INTO Staff (NIN, eName) VALUES ('712670YD', 'Sarah White');

INSERT INTO hotel (hotelNo, hotelLocation) VALUES ('H25', 'Edinburgh');
INSERT INTO hotel (hotelNo, hotelLocation) VALUES ('H4', 'Glasgow');

INSERT INTO contract (contractNo, hotelNo) VALUES ('C1024', 'H25');
INSERT INTO contract (contractNo, hotelNo) VALUES ('C1025', 'H4');

INSERT INTO workHours (NIN, contractNo, no_hours) VALUES ('113567WD', 'C1024', 16);
INSERT INTO workHours (NIN, contractNo, no_hours) VALUES ('234111XA', 'C1024', 24);
INSERT INTO workHours (NIN, contractNo, no_hours) VALUES ('712670YD', 'C1025', 28);
INSERT INTO workHours (NIN, contractNo, no_hours) VALUES ('113567WD', 'C1025', 16);

create view name_of_employee_and_total_no_of_hours
as 
SELECT staff.eName AS Employee, SUM(workHours.no_hours)AS TOTAL_HOURS from staff JOIN workHours ON staff.NIN = workHours.NIN GROUP BY staff.eName, workHours.no_hours;

create or replace function GET_TOTAL_NUMBER_OF_HOURS( 
    in_person_name in number, in_person_hotelLocation in varchar2)
    
    return varchar2
    is person_details varchar2(128);
    
    begin 
        select w.no_hours AS Total_Hours
        into person_details
        from workHours w
        where w.no_hours 
        
        return(person_details);
    end GET_TOTAL_NUMBER_OF_HOURS;
    /
    
    set serveroutput on;
execute dbms_output.put_line(GET_TOTAL_NUMBER_OF_HOURS('John Smith', 'Glasgow'));

create index idx_employee_name
on staff(eName);

commit;


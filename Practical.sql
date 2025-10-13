
-- Drop 
REVOKE CREATE SESSION FROM ICManagement;
drop user ICManagement cascade;

Drop table staff cascade constraints;
Drop table Hotel cascade constraints;
Drop table Contract cascade constraints;
Drop table WorkHours cascade constraints;

-- Create User 
create user ICManagement identified by Changeme0;

alter user ICManagement quota unlimited on USERS;

GRANT CREATE PROCEDURE TO ICManagement;

GRANT CREATE VIEW TO ICManagement;

grant create session to ICManagement with admin option;

GRANT CREATE TABLE TO ICManagement;

grant connect to ICManagement;

alter session set current_schema = ICManagement;

-- tables 
CREATE TABLE staff (
    NIN VARCHAR(100) Primary Key,
    eName VARCHAR(50)
);

CREATE TABLE Hotel (
    HotelNo VARCHAR(100) Primary Key,
    hotelLocation VARCHAR(100)
);

CREATE TABLE Contract (
    ContractNo VARCHAR(100) Primary Key,
    HotelNo VARCHAR(100),
    FOREIGN KEY (HotelNo) REFERENCES Hotel(HotelNo)
);

CREATE TABLE WorkHours(
    NIN VARCHAR(100),
    contractNo VARCHAR(100),
    HoursPerWeek int,
    FOREIGN KEY (contractNo) REFERENCES Contract(ContractNo),
    FOREIGN KEY (NIN) REFERENCES staff(NIN)
);

-- Values 
--NIN, eName
INSERT INTO staff values('113567WD', 'John Smith');
INSERT INTO staff values('234111XA', 'Diane Hocine');
INSERT INTO staff values('712670YD', 'Sarah white');

--Hotelno, HotelLocation 
INSERT INTO Hotel values('H25', 'Edinburgh');
INSERT INTO Hotel values('H4', 'Glasgow');

--ContractNo, HotelNo
INSERT INTO Contract values('C1024', 'H25');
INSERT INTO Contract values('C1025', 'H4');

--NIN, contractNo, HoursPerWeek
INSERT INTO WorkHours values('113567WD', 'C1024', '16');
INSERT INTO WorkHours values('234111XA', 'C1024', '24');
INSERT INTO WorkHours values('712670YD', 'C1025', '28');
INSERT INTO WorkHours values('113567WD', 'C1025', '16');

--important set up for function and Procedure 
SET SERVEROUTPUT ON;

-- 2.)
-- View 
CREATE OR REPLACE VIEW EmployeeWorkHours As
SELECT ename as employee, WorkHours.HoursPerWeek as Total_Hours 
FROM staff 
Left JOIN WorkHours ON staff.NIN=WorkHours.NIN 
--ORDER BY WorkHours.HoursPerWeek;
select * from EmployeeWorkHours;


--3.)
--function 
CREATE OR REPLACE FUNCTION FUNCTION_NAME 
(
  Name in varchar 
) RETURN NUMBER AS 
BEGIN
  RETURN sum(WorkHours.HoursPerWeek);
END FUNCTION_NAME ;
/

--SELECT FUNCTION1('John Smith') AS Result FROM dual;
execute dbms.output.putline(FUNCTION_NAME('John Smith'));


--4.)
CREATE OR REPLACE PROCEDURE PROCEDURE1()
IS
   some_value Number; -- Example variable
BEGIN
   ALTER TABLE staff ADD employee_Name Varchar2;
   ALTER TABLE Hotel ADD Hotel_no Varchar2;
   ALTER TABLE Hotel ADD Hotel_name Varchar2;
   ALTER TABLE Contract ADD Contract_no Varchar2;
   ALTER TABLE WorkHours ADD Hours_per_Week Varchar2;
   
END PROCEDURE1;
/

--SELECT PROCEDURE1(103) AS Result FROM dual;
execute dbms.output.putline(PROCEDURE1);

-- 5.)
-- index 
CREATE INDEX tablestaff ON staff (ename);
SELECT ename FROM staff;

--drop index sample;



commit;










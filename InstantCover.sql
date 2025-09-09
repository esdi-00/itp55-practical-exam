DROP USER Hotelapp CASCADE;
CREATE USER Hotelapp IDENTIFIED BY Changename0;
ALTER USER Hotelapp QUOTA UNLIMITED ON DATA;
ALTER USER Hotelapp QUOTA UNLIMITED ON USERS;

GRANT CREATE SESSION TO HotelApp WITH ADMIN OPTION;
GRANT CONNECT TO Hotelapp;
ALTER SESSION SET CURRENT_SCHEMA = Hotelapp;

DROP TABLE Employees CASCADE CONSTRAINTS;
DROP TABLE HotelPlace CASCADE CONSTRAINTS;
DROP TABLE WorkSchedule CASCADE CONSTRAINTS;

CREATE TABLE Employees (
NIN VARCHAR(10) PRIMARY KEY,
Ename VARCHAR(15));

CREATE TABLE Hotelplace (
hotelNo VARCHAR(5) PRIMARY KEY,
hotelLocation VARCHAR(10));

CREATE TABLE WorkSchedule (
NIN VARCHAR(10),
contactNo VARCHAR(10),
hotelNo VARCHAR(5),
hoursPerWeek VARCHAR (3));

ALTER TABLE WorkSchedule ADD CONSTRAINT fk_NIN FOREIGN KEY (NIN) REFERENCES Employees(NIN);
ALTER TABLE WorkSchedule ADD CONSTRAINT fk_hotelNo FOREIGN KEY (hotelNo) REFERENCES Hotelplace(hotelNo);

INSERT INTO Employees (NIN, Ename) VALUES ('113567WD', 'John Smith');
INSERT INTO Employees (NIN, Ename) VALUES ('234111XA', 'Dianne Hocine');
INSERT INTO Employees (NIN, Ename) VALUES ('712670YD', 'Sarah White');

INSERT INTO Hotelplace (hotelNo, hotelLocation) VALUES ('H25', 'Edinburg');
INSERT INTO Hotelplace (hotelNo, hotelLocation) VALUES ('H4', 'Glasgow');

INSERT INTO WorkSchedule (NIN, contactNo, hotelNo, hoursPerWeek) VALUES ('113567WD', 'C1024', 'H25', 16);
INSERT INTO WorkSchedule (NIN, contactNo, hotelNo, hoursPerWeek) VALUES ('234111XA', 'C1024', 'H25', 24);
INSERT INTO WorkSchedule (NIN, contactNo, hotelNo, hoursPerWeek) VALUES ('712670YD', 'C1025', 'H4', 28);
INSERT INTO WorkSchedule (NIN, contactNo, hotelNo, hoursPerWeek) VALUES ('113567WD', 'C1025', 'H4', 16);

commit;

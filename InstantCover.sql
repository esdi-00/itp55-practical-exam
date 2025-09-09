DROP USER InstantCover CASCADE; 

CREATE USER InstantCover IDENTIFIED BY Changeme0; 
ALTER USER InstantCover QUOTA UNLIMITED ON DATA; 
ALTER USER InstantCover QUOTA UNLIMITED ON USERS; 

GRANT CREATE SESSION TO InstantCover WITH ADMIN OPTION; 
GRANT CONNECT TO InstantCover; 
ALTER SESSION SET CURRENT_SCHEMA = InstantCover;

DROP TABLE employee cascade constraints;
DROP TABLE hotel cascade constraints;
DROP TABLE employeeDetail cascade constraints;

CREATE TABLE employee ( 
NIN varchar(20) PRIMARY KEY,
eName varchar(50) ); 

CREATE TABLE hotel ( 
hotelNo varchar(20) PRIMARY KEY,
hotelLocation varchar(50) ); 

CREATE TABLE employeeDetail ( 
NIN varchar(20),
hotelNo varchar(50),
hourPerWeek int,
contractNo varchar(20)); 

ALTER TABLE employeeDetail  ADD CONSTRAINT fk_NIN FOREIGN KEY (NIN) REFERENCES employee(NIN);
ALTER TABLE employeeDetail  ADD CONSTRAINT fk_Hotel_No FOREIGN KEY (hotelNo) REFERENCES hotel(hotelNo);

INSERT INTO employee (NIN, eName) VALUES ('113567WD', 'John Smith');
INSERT INTO employee (NIN, eName) VALUES ('234111XA', 'Diane Hocine');
INSERT INTO employee (NIN, eName) VALUES ('712670YD', 'Sarah White');

INSERT INTO hotel (hotelNo, hotelLocation) VALUES ('H25', 'Edinburgh');
INSERT INTO hotel (hotelNo, hotelLocation) VALUES ('H4', 'Glasgow');

INSERT INTO employeeDetail (NIN, hotelNo, hourPerWeek, contractNo) VALUES ('113567WD', 'H25', 16, 'C1024');
INSERT INTO employeeDetail (NIN, hotelNo, hourPerWeek, contractNo) VALUES ('234111XA', 'H25', 24, 'C1024');
INSERT INTO employeeDetail (NIN, hotelNo, hourPerWeek, contractNo) VALUES ('712670YD', 'H4', 28, 'C1025');
INSERT INTO employeeDetail (NIN, hotelNo, hourPerWeek, contractNo) VALUES ('113567WD', 'H4', 16, 'C1025');

commit;

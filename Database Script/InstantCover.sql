DROP USER AgencyApp CASCADE;

CREATE USER AgencyApp IDENTIFIED BY Changeme0; 
ALTER USER AgencyApp QUOTA UNLIMITED ON DATA; 
ALTER USER AgencyApp QUOTA UNLIMITED ON USERS; 

GRANT CREATE SESSION TO AgencyApp WITH ADMIN OPTION; 
GRANT CONNECT TO AgencyApp; 
ALTER SESSION SET CURRENT_SCHEMA = AgencyApp; 

DROP TABLE Employee cascade constraints;
DROP TABLE Hotel cascade constraints;
DROP TABLE Contract cascade constraints;
DROP TABLE WorkDone cascade constraints;

CREATE TABLE Employee ( 
NIN varchar(8) PRIMARY KEY,
eName varchar(20) ); 

CREATE TABLE Hotel (
hotelNo varchar(3) PRIMARY KEY,
hotelLocation varchar(20) ); 

CREATE TABLE Contract ( 
contractNo varchar(5) PRIMARY KEY,
hotelNo varchar(3) ); 

CREATE TABLE WorkDone ( 
NIN varchar(8),
contractNo varchar(5),
hoursPerWeek number(3) ); 

ALTER TABLE WorkDone  ADD CONSTRAINT fk_NIN FOREIGN KEY (NIN) REFERENCES Employee(NIN);
ALTER TABLE WorkDone  ADD CONSTRAINT fk_contractNo FOREIGN KEY (contractNo) REFERENCES Contract(contractNo);
ALTER TABLE Contract  ADD CONSTRAINT fk_hotelNo FOREIGN KEY (hotelNo) REFERENCES Hotel(hotelNo);

INSERT INTO Employee (NIN, eName) VALUES ('113567WD', 'John Smith');
INSERT INTO Employee (NIN, eName) VALUES ('234111XA', 'Diane Hocine');
INSERT INTO Employee (NIN, eName) VALUES ('712670YD', 'Sarah White');

INSERT INTO Hotel (hotelNo,hotelLocation) VALUES ('H25', 'Edinburgh');
INSERT INTO Hotel (hotelNo,hotelLocation) VALUES ('H4', 'Glasgow');

INSERT INTO Contract (contractNo, hotelNo) VALUES ('C1024', 'H25');
INSERT INTO Contract (contractNo, hotelNo) VALUES ('C1025', 'H4');

INSERT INTO WorkDone (NIN, contractNo, hoursPerWeek) VALUES ('113567WD', 'C1024', 16);
INSERT INTO WorkDone (NIN, contractNo, hoursPerWeek) VALUES ('234111XA', 'C1024', 24);
INSERT INTO WorkDone (NIN, contractNo, hoursPerWeek) VALUES ('712670YD', 'C1025', 28);
INSERT INTO WorkDone (NIN, contractNo, hoursPerWeek) VALUES ('113567WD', 'C1025', 16);

COMMIT;



DROP USER InstantCover CASCADE; 

CREATE USER InstantCover IDENTIFIED BY Changeme0; 
ALTER USER InstantCover QUOTA UNLIMITED ON DATA; 
ALTER USER InstantCover QUOTA UNLIMITED ON USERS; 

GRANT CREATE SESSION TO InstantCover WITH ADMIN OPTION; 
GRANT CONNECT TO InstantCover; 
ALTER SESSION SET CURRENT_SCHEMA = InstantCover; 

DROP TABLE Employee cascade constraints;
DROP TABLE Hotel cascade constraints;
DROP TABLE EmployeeContract cascade constraints;

CREATE TABLE Employee ( 
NIN varchar(10) PRIMARY KEY,
eName varchar(15)); 

CREATE TABLE Hotel ( 
hotelNo varchar(3) PRIMARY KEY,
hotelLocation varchar(10) );  

CREATE TABLE EmployeeContract ( 
NIN varchar(10), 
hotelNo varchar(3), 
contractNo varchar(5), 
hourPerWeek int ); 

ALTER TABLE EmployeeContract  ADD CONSTRAINT fk_NIN FOREIGN KEY (NIN) REFERENCES Employee(NIN );
ALTER TABLE EmployeeContract ADD CONSTRAINT fk_hotelNo FOREIGN KEY (hotelNo ) REFERENCES Hotel(hotelNo );

INSERT INTO Employee (NIN, eName) VALUES ('113567WD', 'John Smith');
INSERT INTO Employee (NIN, eName) VALUES ('234111XA', 'Diane Hocine');
INSERT INTO Employee (NIN, eName) VALUES ('712670YD', 'Sarah White');

INSERT INTO Hotel (hotelNo, hotelLocation) VALUES ('H25', 'Edinburgh');
INSERT INTO Hotel (hotelNo, hotelLocation) VALUES ('H4', 'Glasgow');

INSERT INTO EmployeeContract (NIN, hotelNo, contractNo, hourPerWeek) VALUES ('113567WD', 'H25', 'C1024', 16);
INSERT INTO EmployeeContract (NIN, hotelNo, contractNo, hourPerWeek) VALUES ('113567WD', 'H4', 'C1025', 16);
INSERT INTO EmployeeContract (NIN, hotelNo, contractNo, hourPerWeek) VALUES ('234111XA', 'H25', 'C1024', 24);
INSERT INTO EmployeeContract (NIN, hotelNo, contractNo, hourPerWeek) VALUES ('712670YD', 'H4', 'C1025', 28);

commit;
DROP USER InstantCover CASCADE; 

CREATE USER InstantCover IDENTIFIED BY Changeme0; 
ALTER USER InstantCover QUOTA UNLIMITED ON DATA; 
ALTER USER InstantCover QUOTA UNLIMITED ON USERS; 

GRANT CREATE SESSION TO InstantCover WITH ADMIN OPTION; 
GRANT CONNECT TO InstantCover; 
ALTER SESSION SET CURRENT_SCHEMA = InstantCover; 

DROP TABLE Staff cascade constraints;
DROP TABLE Hotel cascade constraints;
DROP TABLE Contract cascade constraints;
DROP TABLE WorkHours cascade constraints;

CREATE TABLE Staff ( 
NIN varchar(10) PRIMARY KEY,
eName varchar(15)); 

CREATE TABLE Hotel ( 
hotelNo varchar(3) PRIMARY KEY,
hotelLocation varchar(10) ); 

CREATE TABLE Contract (  
contractNo varchar(5) PRIMARY KEY,
hotelNo varchar(3));

CREATE TABLE WorkHours (
hourPerWeek int,
NIN varchar(10), 
contractNo varchar(5)); 

ALTER TABLE Contract ADD CONSTRAINT fk_hotelNo FOREIGN KEY (hotelNo ) REFERENCES Hotel(hotelNo );
ALTER TABLE WorkHours ADD CONSTRAINT fk_contractNo FOREIGN KEY (contractNo ) REFERENCES Contract(contractNo );
ALTER TABLE WorkHours ADD CONSTRAINT fk_NIN FOREIGN KEY (NIN ) REFERENCES Staff(NIN );

INSERT INTO Staff (NIN, eName) VALUES ('113567WD', 'John Smith');
INSERT INTO Staff (NIN, eName) VALUES ('234111XA', 'Diane Hocine');
INSERT INTO Staff (NIN, eName) VALUES ('712670YD', 'Sarah White');

INSERT INTO Hotel (hotelNo, hotelLocation) VALUES ('H25', 'Edinburgh');
INSERT INTO Hotel (hotelNo, hotelLocation) VALUES ('H4', 'Glasgow');

INSERT INTO Contract (contractNo, hotelNo) VALUES ( 'C1024', 'H25');
INSERT INTO Contract (contractNo, hotelNo) VALUES ( 'C1025', 'H4');

INSERT INTO WorkHours (hourPerWeek, NIN, contractNo ) VALUES (16, '113567WD', 'C1024');
INSERT INTO WorkHours (hourPerWeek, NIN, contractNo ) VALUES (16, '113567WD', 'C1025');
INSERT INTO WorkHours (hourPerWeek, NIN, contractNo ) VALUES (24,'234111XA', 'C1024');
INSERT INTO WorkHours (hourPerWeek, NIN, contractNo ) VALUES (28,'712670YD', 'C1025');

commit;

create view Total_Hours 
as select sum(hourPerWeek) as Total_Hours
from WorkHours;

create or replace function GET_TOTAL_HOURS( 
    in_workhours in int, in_staffname in varchar2)
    
    return int
    is staff_hours int;
    
    begin 
        select sum(h.hourPerWeek)|| ' '|| s.eName
        into staff_hours
        from Staff s, Hotel h
        where s.eName = in_staffname 
        and h.hotelLocation = in_workhours;
        
        return(staff_hours);
    end GET_TOTAL_HOURS;
    /
    
    create or replace procedure INSERT_ALL_TABLES(
    NIN in varchar,
    eName in varchar,
    hotelNo in varchar,
    hotelLocation in varchar,
    contractNo in varchar,
    hourPerWeek in int
    )
as 
begin 
    insert into Staff values (NIN, eName);
    insert into Hotel values (hotelNo, hotelLocation );
    insert into Contract values (contractNo, hotelNo);
    insert into WorkHours values (hourPerWeek, NIN, contractNo);
    dbms_output.put_line('new person inserted');
    commit;
end INSERT_ALL_TABLES;
/
create index idx_staff_name
on Staff(eName);

set serveroutput on;
    execute dbms_output.put_line(GET_TOTAL_HOURS('John Smith', 'Glasglow'));
    execute INSERT_ALL_TABLES('101010DA', 'Jose', 'H10', 'Manila', 'C1010', 10);
    select /*+ index(s idx_staff_name) */ * from Staff s where eName like 'John Smith';
    
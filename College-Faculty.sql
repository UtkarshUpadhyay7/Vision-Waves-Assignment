-- 1] Creating a database
create database  college_db;

-- 2]  Selecting an database
use college_db;

-- 3] creating an faculty table
create table faculty(
faculty_id int ,
faculty_name varchar(50),
subject varchar(50),
salary float
);

-- 4] Inserting an faculty record
Insert into faculty values
(701,'John','Java',35000), (702,'Alice','Python',42000) , (703,'Bob' , 'AI -ML ' , 50000);

-- 5]  Display faculty with specific subject
Select * from faculty where subject ='Python';



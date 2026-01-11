-- 1]  Creating an database
     create database hr_db;

--  2] select a database
use hr_db;

-- 3] Creating table Employee
create table Employee(
 emp_id int primary key Auto_increment,
 emp_name varchar(75),
 department varchar(30),
 salary float
 );
 
 -- 4] Insert records  of 3 employee
 Insert into employee  (emp_id , emp_name , department , salary) values
 (101 ,'Utkarsh','Backend Developer' ,25000),
 (102 ,'Virat','Python Developer' ,2500.35),
 (103 ,'Rohit','Mern -Stack Developer' ,2500);
 
 -- 5] Dispaly  all records
 select * from employee;
 
 
 
 

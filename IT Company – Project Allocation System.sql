-- 1] Creating a Database
create database project_db;

-- 2] Using a Database
use project_db;

-- 3] Create table Employee
create table employee(
emp_id int,
emp_name varchar(75)
);

-- 4] Create Another table project
create table project(
project_id int,
project_name varchar(100),
emp_id int 
);

-- 5] Inserting sample in both tables
Insert into employee (emp_id ,emp_name) values
(1,'Rohan'), (2,'Rahul'),(3,'Rohit'),(4,'Rishi');

Insert into project (project_id,project_name) values
(750,'DR- Recovery',1), (751,'AI Chat-bot',2) , (752,'Resume Tracker',3) ,(753,'voting App ',4);

-- 6]Display  all records
select * from employee;
select * from project;




-- 1] Creating an database
create database startup_db;

-- 2] Use database
use startup_db;

-- 3] Creating an table employee
create table employee(
emp_id int ,
emp_name varchar(80),
joining_date date
);

-- 4] Insert 2 employee
Insert into employee values
(1,'Utkarsh','2026-04-07'), (2,'Rahul','2026-07-07');

-- 5]  Display employee names and joining date
select emp_name ,  joining_date from employee;
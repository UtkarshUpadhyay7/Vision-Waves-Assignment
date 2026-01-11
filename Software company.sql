-- 1] Creating an database
create database software_company;

-- 2] Selecting an database
use software_company;

-- 3] Create table employee
create table employee(
emp_id int primary key auto_increment,
emp_name varchar(50),
salary float
);

-- 4] Inserting an valid deatails
Insert into employee values(101,'Utaksrh',90000);

-- 5]  Inserting an employee with same Emp_id
insert into employee values(101,'Suraj',75000); -- Throw an error

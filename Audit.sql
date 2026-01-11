-- 1] Creating an database
create database audit_db;

-- 2] Select an database
use audit_db;

-- 3] Create an table SystemUser
create table SystemUser(
user_id int ,
username varchar(20),
email varchar(50)
);

-- 4] Insert 2 users
Insert into SystemUser values 
(101,'Sam','Sam77@gmail.co,') , (102,'Leo','Leo23@gmail.com');

-- 5] Query to show all databases
show databases;

-- 6] Query to show tables of audit
show tables;


-- 7]  Descibe table 
desc SystemUser;

-- 1] Creating a database 
create database training_company;

-- 2] Using a database
use training_company;

-- 3] Creating an table student
create table student (
student_id  int ,
name varchar(75),
email varchar (100)
);

-- 4] create table course
create table course (
course_id int ,
course_name varchar(50),
duration varchar(40)
);

-- 5] insert into student
Insert into student (student_id , name , email) values
(100,'Utkarsh','utttu7@gmail.com') , (101,'Krish','Krish18@gmail.com');

-- 6]  Insert into course
insert into course (course_id , course_name , duration) values
(1,'Java','15 Days ') , (2,'Python','25 Days ');

-- 7] Display both tables
select * from student ;
select * from course;
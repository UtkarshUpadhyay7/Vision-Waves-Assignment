-- 1] Creating an database
create database logistics_db;

-- 2] Selecting an database
Use logistics_db;

-- 3] Creating an delivery table
create table delivery (
delivery_id int,
customer_name varchar(100),
delivery_date date,
is_delivered boolean
);

-- 4]Insert the details
Insert into delivery values
(7,'Uttu','2026-01-11',true) , (17,'piyu','2026-01-31',false);

-- 5] Display delivered packages
select * from delivery where is_delivered = true;

-- 1] Creating an database
create database ecommerce_db;

-- 2]  Use an database
use ecommerce_db;

-- 3] create a product  table
create table product(
product_id int,
product_name varchar(50),
price float,
is_available boolean
);

-- 4] Insert the product
Insert into product  values(1,'Laptop',55000,true);
Insert into product  values(2,'Mobile',155000,true);
Insert into product  values(3,'Television',5500,false);

-- 5] Display only avalibale product
select * from product where is_available = true;

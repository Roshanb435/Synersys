use ecom;
create table user(uname varchar(25),email varchar(25),contact long,
pasword varchar(25),confirmpw varchar(25),gender varchar(1));

create table product(cat varchar(25),pid int,pname varchar(25),price decimal(7,2));
select * from product;

select *from user;
drop table user;
create table user(uname varchar(25),email varchar(25),contact bigint,
password varchar(25),confirmpw varchar(25),gender varchar(5));

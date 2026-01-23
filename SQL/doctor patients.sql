select *from doctor;
insert into synersys.doctor values (112,"Rosh","mind","M",2,"yes"),(113,"sai","hand","F",3,"yes"),
(114,"pri","leg","F",6,"no"),
(115,"thri","hand","F",10,"yes"),
(116,"Ruk","ENT","F",4,"no");

show tables;

alter table doctor add contact bigint unique;

update doctor set contact=7569655435 where id=111;

show tables;

select * from doctor;

rename table doctor to doctors;

show tables; 

select *from doctors;

desc doctors;

alter table doctors rename column dname to drname;
desc doctors;

select *from doctors;

alter table doctors modify column drname char(35);
desc doctors;

alter table doctors drop column contact;
select * from doctors;

alter table doctors drop column gender;
desc doctors;

select *from doctors;

delete from doctors where exp=5;

select *from doctors;

use synersys;

create table patient (id int primary key,
name varchar(25), 
disease varchar(30),
age int,
docapt varchar(35));

insert into synersys.patient values (1,"Ro","fever",20,"yes"),(2,"bo","cold",10,"yes"),
(3,"pro","cough",6,"no"),
(4,"thro","headache",10,"yes"),
(5,"Ru","bodypains",4,"no");

select *from patient;

update patient set id=2 where id=12;
select *from patient;
alter table doctors add column pid int;

select *from doctors;

update doctors set pid=1 where id=111;
update doctors set pid=2 where id=113;
update doctors set pid=5 where id=115;
update doctors set pid=3 where id=116;
update doctors set pid=4 where id=112;

select *from doctors;

select *
from doctors d
inner join patient p
on d.pid = p.id;

select * from doctors cross join patient;

select d.drname, d.sp, c.name ,d.pid , c.id
from doctors d join patient c
on d.id=c.name;

select d.drname, c.name
from doctors d left join patient c
on d.id=c.name; 

alter table patient rename column name to pname;

select d.drname, c.pname
from doctors d left join patient c
on d.id=c.pname; 

use world;
select *from city;
select * from country;
select *from city;










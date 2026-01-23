use world;

drop function if exists division
delimiter $$
create function `division`(d int,b int)
returns float
begin 
declare result float;
set b=23;
set result=b%d;
RETURN d;
end $$

select division(10.5,@b);


drop function if exists age_category;
delimiter $$
create function age_category(age int)
returns varchar(30)
deterministic
begin
    declare result varchar(30);
    if age < 18  then
        set result = 'minor';
    elseif age >= 18 and age <= 45 then
        set result = 'adult';
    else
        set result = 'senior citizen';
    end if;
    return result;
end $$

select age_category(18);
select age_category(65);

delimiter $$
create function greatest_in_three(a int, b int,c int)
returns varchar(30)
deterministic
begin 
	declare result varchar(30);
	if a>b and a>c then
    set result='a is greater';
    elseif b>a and b>c then
    set result='b is greater';
    else 
    set result='c is greater';
    end if;
    return result;
end $$

select greatest_in_three(10,5,3);
select greatest_in_three(10,15,3);


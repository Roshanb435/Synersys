use world;

drop procedure if exists square
delimiter $$
create procedure `square`(INOUT val int)
begin 
set val=val*val;
 end $$ 
 
 set @val=5;
 call square(@val);
 select @val;
 
 delimiter $$
 create procedure `add_using_in_out_paramters`(IN a int, IN b int, OUT res int)
 begin 
  set res=a+b;
  end $$
  
  call add_using_in_out_paramters(2,4,@res);
  
  select @res;
use world;

delimiter $$ 
create procedure `updating_population`()
begin 
update world_city set population=population *0.14;
end $$

delimiter $$ 
create procedure `updating_populationusinginparameter`(IN val int)
begin 
update world_city set population=population *val;
end $$

call world.updating_population();

select * from world_city;

call updating_populationusinginparameter(85);

select * from world_city;





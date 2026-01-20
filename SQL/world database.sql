use world;
select * from city; 

select max(population) from world.city;

Select district
from city
group by district, countrycode
having countrycode = 'AFG';

select district,population 
from world.city 
where countrycode = (select countrycode from world.city group by CountryCode limit 1);

select population from city
group by  district, population 
having district='oran';

select countrycode , count(countrycode) as c 
from city
group by countrycode
order by c desc limit 1;

select * from country; 

SELECT name,continent, region, max(LifeExpectancy) as maxlife
FROM country
group by continent, region,name,LifeExpectancy
order by LifeExpectancy desc;

select min(continent) 
from country;

select max(continent)
from country;

select name, continent, region, population
from country
order by population DESC
limit 1, 1;

create index idx_population on city (population);
create index idx_continent on country(continent);
create unique index idx_name on country(name);

select continent from country;

drop index idx_continent on country;

create index idx_continent_region on country(continent,region);

select continent, region from country;

call world.city;

delimiter $$
CREATE PROCEDURE `list_of_continents` ()
BEGIN
select continent from world.country;
END $$

call list_of_continents;

create table world_city as select * from city;world_city
















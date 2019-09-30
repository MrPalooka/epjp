describe regions;

select *
from regions;

select sysdate
from dual;

select 4 * 5
from dual;

select region_name
from regions;

SELECT region_name
FROM regions
WHERE region_id = 1; -- commento

SELECT ROWID, ROWNUM, region_name
FROM regions;

SELECT table_name
FROM user_tables;

select column_name, nullable, data_type, data_length, data_precision, data_scale
from user_tab_columns
where table_name = 'JOBS';

select 1+2, 3-4, 2*6, 5/2
from dual;

select to_date('30-NOV-2019') + 2, to_date('02-NOV-2019') - 3
from dual;

select to_date('02-NOV-2019') - to_date('25-MAR-2019') as "How many days"
from dual;

select job_title, min_salary, min_salary + 2000, min_salary * 3 + 1000
from jobs

select first_name || ' ' || last_name as "Employee's name"
from employees;

select first_name, last_name, commission_pct
from employees
where commission_pct is null; 

select first_name, last_name, commission_pct
from employees
where commission_pct is null;

select first_name, last_name, 12 * salary * commission_pct
from employees;

select first_name, last_name, 12 * salary * nvl(commission_pct, 0) --nvl è simile ad un if(valore che voglio rimanga, valore che voglio)
from employees;

select 12 * salary * commission_pct as "annual commission"
from employees
where employee_id = 145;

select 12 * salary * commission_pct as "annual commission" 
from employees
where first_name = 'John' and last_name = 'Russell';

SELECT COUNT(ROWID)
FROM EMPLOYEES;

select manager_id
from employees;

select distinct manager_id
from employees;

select count(distinct first_name)
from employees;

select *
from regions
where region_id != 1;

select *
from regions
where region_id > any (1,2,3);

select last_name
from employees
where last_name like 'S%h';

select * from regions
where region_id not in (2, 3);

select * from regions
where region_id not in (2, 3, null); -- Null si mangia tutto

select * from regions where region_id
between 2 and 3;

 select * from employees
 where manager_id is null;
 
 select * from employees 
 where salary < 3000 and employee_id > 195; 
 
 select * from employees
 where salary > 20000 or last_name = 'King'; 
 
 select * from employees
 where not department_id > 20;
 
 select * from employees
 order by last_name; 
 
 select * from employees
 order by last_name desc, first_name asc;
 
 select first_name, last_name
 from employees order by 2;
 
 select first_name, last_name, email, phone_number, hire_date
 from employees;
 
 select *
 from employees
 where first_name = 'David' OR first_name= 'Peter';
 
 select *
 from employees
 where department_id = 60;
 
 select *
 from employees
 where department_id = 50 or department_id = 30;
 
 select *
 from employees
 where salary > 10000;
 
 select *
 from employees
 where salary > 4000 and salary < 15000;
 
 select *
 from employees
 where (salary < 4000 or salary > 15000) and (department_id =30 or department_id=80);
 
select *
from employees
where hire_date between '1-GEN-2005' and '31-DIC-2005';

select *
from employees
order by job_id;

select *
from employees
where not commission_pct is null;

select first_name, last_name
from employees
where first_name like '%a%' or last_name like '%a%';

select department_name
from departments
order by department_name;

select street_address
from locations
where country_id = 'IT';

select job_id
from jobs
where job_title like '%Clerk%'; 

select *
from locations
where postal_code not like '0%' or postal_code is null;

select region_name
from regions
where region_id = 1;

select country_name
from countries
where region_id = 1;

select region_name, country_name
from regions, countries
where regions.region_id = countries.region_id;

select r.region_name, c.country_name
from regions r, countries c
where r.region_id = c.region_id;

select region_name, country_name
from regions join countries
using(region_id)
order by 1;

select region_name, country_name
from regions natural join countries;


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

select region_name, country_name
from regions join countries 
on(regions.region_id = countries.region_id);

select region_name, country_name
from regions cross join countries;

select e.last_name as employee, m.last_name as manager
from employees e join employees m
on (e.manager_id = m.employee_id)
order by 2;

select e.last_name, e.salary, j.min_salary
from employees e join jobs j on(e.salary between j.min_salary and j.min_salary + 100)
where(e.job_id = j.job_id);

select first_name, department_name
from employees left outer join departments using(department_id)
where last_name = 'Grant';

select first_name, last_name, department_name
from employees right outer join departments
using(department_id)
where department_id between 110 and 120;

select e.last_name, d.department_name
from employees e full outer join departments d
on (e.department_id = d.department_id)
where last_name = 'Grant' or d.department_id between 110 and 120;

select e.first_name, d.department_name
from employees e join departments d
using (department_id);

select e.first_name, j.job_title
from employees e join jobs j
using (job_id);

select e.first_name, e.salary, j.min_salary, j.max_salary
from employees e join jobs j
using (job_id)
where e.salary=j.min_salary or e.salary=j.max_salary;

select e.first_name
from employees e join departments d using (department_id) 
join locations l using (location_id)
where l.country_id = 'UK';

select d.department_name,e.first_name
from employees e join departments d
on (d.manager_id=e.employee_id);

select d.department_name, e.first_name
from employees e right outer join departments d
on (d.manager_id=e.employee_id);

select d.department_name, e.first_name
from employees e right outer join departments d
on (d.manager_id=e.employee_id);

select d.department_name, e.first_name
from employees e right outer join departments d
on (d.manager_id=e.employee_id)
where first_name is null;

select e.first_name as manager, m.first_name as employee
from employees e join employees m
on (m.manager_id=e.employee_id)
order by 1;

select *
from employees
where trunc(hire_date, 'year') = '01-GEN-2005';

select last_name from employees 
where regexp_like(last_name, '^[AE].*');

select salary, 8.5 * salary /100 + salary as incremento,  8.5 * salary /100 as delta
from employees;

select first_name,last_name 
from employees
where regexp_like(last_name, '^[aA].') or regexp_like(first_name, '[aA].');

select first_name, last_name, -trunc(MONTHS_BETWEEN(hire_date,sysdate))
FROM employees;

select rpad('*', salary /1000, '*'), salary
from employees;

select nvl(to_char(commission_pct),'no value')
from employees;

select department_id, trunc(avg(salary))
from employees group by department_id having avg(salary) < (    select max(avg(salary)) 
from employees group by department_id);

select first_name, last_name
from employees
where employee_id = (select manager_id from employees where last_name = 'Chen');

select employee_id
from (select employee_id from employees where employee_id between 112 and 115);

select distinct manager_id 
from employees 
where manager_id is not null;

select first_name, last_name
from employees
where employee_id not in ( select manager_id from employees where manager_id is not null);

select region_id, count(rowid) country_count    
from countries group by (region_id);

select first_name, last_name 
from employees 
where employee_id in(select distinct manager_id from employees 
where manager_id is not null)
order by 2;

select job_id,max(salary), min(salary), sum(salary), trunc(avg(salary))
from employees
group by job_id;

select job_id, count(employee_id)
from employees
group by job_id;

select count(employee_id)
from employees
where job_id = 'IT_PROG';

select count(employee_id)
from employees
where employee_id not in (select distinct manager_id from employees where manager_id is not null);

select max(salary)-min(salary)
from employees;

select job_id,max(salary)-min(salary)
from employees
group by job_id
having max(salary)-min(salary) != 0;

select manager_id, min(salary)
from employees
group by manager_id
having (min(salary) >= 6000) and (manager_id is not null);

select l.street_address, l.postal_code, c.country_name 
from locations l join countries c
using (country_id);

select first_name, department_name
from employees join departments
using (department_id);

select first_name, department_name
from employees join departments using (department_id)
join locations using (location_id)
where city = 'Toronto';

select first_name, last_name
from employees
where hire_date > (select hire_date from employees where first_name='David' and last_name='Lee');

select hire_date from employees where first_name='David' and last_name='Lee';

select e.first_name, e.last_name, e.hire_date, m.hire_date
from employees e join employees m
on (e.manager_id=m.employee_id)
where e.hire_date<m.hire_date;

select first_name, last_name
from employees
where manager_id = (select manager_id from employees where first_name='Lisa' and last_name='Ozer');

select manager_id from employees where first_name='Lisa' and last_name='Ozer';

select e.first_name, e.last_name, d.department_id
from employees e join departments d
using (department_id)
where (e.last_name like '%u%') or (e.last_name like 'U%');

select first_name, last_name
from employees join departments
using (department_id)
where department_name = 'Shipping';

select first_name, last_name
from employees
where manager_id = (select employee_id from employees where first_name= 'Steven' and last_name='King');

insert into regions
VALUES(12,null);

SELECT  *FROM regions;

rollback;
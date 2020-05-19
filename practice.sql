-- write a query to fetch employee firstname and salary together using alias name EmpSalary
select concat(first_name,'-', salary)as empsalary from employees;

-- Write a query to get all the employers who are IT programmers (job id= IT_PROG) and whose salary>20000
select first_name, salary from employees where job_id in (select job_id from employees where job_id = 'IT_PROG' and salary > 20000);
select max(salary) from employees where job_id = 'IT_PROG';

-- write a query to find length of fullname(firstname+lastname) of all employees
select first_name, last_name, length(concat(first_name,last_name))as fullnameLength from employees;

-- write a query to get employees sorted by manager_id
select first_name, manager_id from employees order by manager_id;


-- write a query to fetch employees whose last_name ends with 'en'.
select last_name from employees where last_name like '%en';

-- Write a query to Select first_name, dept name, deptid,salary  from employees table and departments table  based on all the common column. 
select e.first_name,d.department_name, e.salary, e.department_id from employees e left join departments d on e.department_id = d.department_id;

-- Write a query to Select first_name, dept name, deptid,salary  from employees table and departments table  based on dept id
select e.first_name,d.department_name, e.salary, e.department_id from employees e left join departments d on e.department_id = d.department_id;

-- Write a query to Select  city, firstname, deptname  for an employee
select e.first_name, d.department_name, l.city from employees e, departments d, locations l where e.department_id = d.department_id and l.location_id = d.location_id;
select e.first_name, d.department_name, l.city from employees e left join departments d on e.department_id = d.department_id inner join locations l on d.location_id = l.location_id;

-- Write a query to fetch  empname, deptname and deptid  of all the departments with and without employees.
select e.first_name,d.department_name,d.department_id from employees e right join departments d on e.department_id=d.department_id where employee_id is null;

-- query to find min sal under each job category in specific  department.
select min(salary), department_name, job_title from employees e, jobs j, departments d where e.department_id=d.department_id and j.job_id=e.job_id group by department_name, job_title;
select min(salary), department_name, job_title from employees e join departments d on e.department_id = d.department_id inner join jobs j on j.job_id=e.job_id group by department_name, job_title;

-- fetch employees whose salary is less than salaries of  employee with job_id IT_PROG
select salary, job_id from employees where salary < (select min(salary) from employees where job_id = 'IT_PROG');
select min(salary) from employees where job_id = 'IT_PROG';

-- write a query to select first_name and hiredate of employees who were hired after employee Steven.----******
select first_name, hire_date from employees where hire_date > (select hire_date from employees where last_name = 'Steven');
select first_name,last_name, hire_date from employees where first_name = 'Steven';

-- query to find employee details of first highest salaried person.
select max(salary), first_name,last_name, job_id from employees group by first_name,last_name,job_id limit 1;

******************************************************************************************

-- Write a query to get the department name and number of employees in the department.
select count(*) employee_id, d.department_name from departments d inner join employees e 
on e.department_id=d.department_id group by department_name;

-- Write a query to find the name (first_name, last_name), and salary of the employees whose salary is greater than the average salary.
select first_name, last_name,salary from employees where salary >(select avg(salary) as avgsalary from employees);


select manager_id, min(salary) as salary from employees where manager_id is not null group by manager_id order by salary;

-- find fn,ln of employees who works in IT departments
select e.first_name, e.last_name from employees e left join  departments d on e.department_id= d.department_id where department_name = 'IT';

-- find fn,ln of all employees who are managers
select distinct  m.first_name, m.last_name from employees e inner join employees m on m.employee_id = e.manager_id;

-- find the fn,ln and hire date of employees who was hired after 'jones'
select concat(first_name,' ',last_name)as fullname , hire_date from employees where hire_date > (select hire_date from employees where first_name = 'Mattea');


-- get department_name and number of employees in each department
select department_name, count(*) employee_id  from departments d left join employees e on e.department_id = d.department_id group by department_name;


select personname,d.departmentname,d.departmentcode
from person p
inner join
department d
on p.departmentid=d.departmentid


select max(salary),min(salary),d.departmentname
from person p
inner join
department d
on d.departmentid = p.departmentid
group by d.departmentname

select d.departmentname
from person p
inner join
department d
on d.departmentid = p.departmentid
group by d.departmentname
having sum(salary)>100000


select person.personname,person.salary,department.departmentname
from person 
inner join 
department
on person.departmentid=department.departmentid

select person.personname 
from person
left outer join
department
on person.departmentid=department.departmentid
where department.departmentid is  null

select count(*)
from person p
inner join
department d
on p.departmentid=d.departmentid
group by d.departmentname


select avg(salary)
from person p
inner join
department d
on d.departmentid=p.departmentid
where d.departmentname='ahmedabad'

select p.personname+'earns'+cast(p.salary as varchar)+'from department'+d.departmentname+'monthly'
from person p
inner join 
department d
on p.departmentid=d.departmentid

select d.departmentname
from person p
inner join 
department d
on p.departmentid=d.departmentid
where p.personname is null

select sum(salary),avg(salary),max(salary)
from person p
inner join 
department d
on p.departmentid=d.departmentid
group by d.departmentname

select distinct city from person

select d.departmentname,count(*)
from person p
inner join  
department d
on p.departmentid=d.departmentid
group by d.departmentname
having count(*)>2

select left(personname,3)+right(city,3)from person

select * from person 
update person set salary=salary+salary*.1
where departmentid=(select departmentid from department where departmentname='computer')

select * from person 
where (getdate()-joningdate)>365

sp_rename 'department.deparmentname','departmentname'
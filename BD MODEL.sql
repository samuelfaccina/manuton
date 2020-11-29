create database projetopoo

go 
use projetopoo


go
create table os(
id int identity primary key,
tipo varchar(100) not null,
cidade varchar(100) not null,
olocal varchar(100) not null,
area varchar(100) not null,
obs varchar(100) not null
)
select * from os
/*
select * from os

/*
insert into os (tipo,cidade,olocal,area,obs)
values ('1','1','1','1','1') 

/*
CREATE LOGIN <login_name> WITH PASSWORD = '<enterStrongPasswordHere>';
GRANT insert ON os TO dashboard;  
GRANT select ON os TO dashboard;  
GRANT delete ON os TO dashboard;  
*/
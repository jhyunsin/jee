create table account(
account_no int primary key,
name varchar2(20),
money int,
pw varchar2(20),
id varchar2(20)
);
select * from account;
insert into account(account_no,name,money,pw,id) 
values(850101,'홍길동',100,'123','hong');
insert into account(account_no,name) 
values(900101,'김선달');

drop table account;



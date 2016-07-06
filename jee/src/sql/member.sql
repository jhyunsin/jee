select * from member;
create table member(
			 id varchar2(20) primary key,
			 pw varchar2(20),
			 name varchar2(20),
			 reg_date varchar2(20),
			 ssn varchar2(10)
			 );

--CREATE
insert into member(id,pw,name,reg_date,ssn)
values('lee','1','이순신','2016-07-01','800101-1');
insert into member(id,pw,name,reg_date,ssn)
values('hong1','1','홍길동','2015-07-01','901201-1');
insert into member(id,pw,name,reg_date,ssn)
values('you','1','유관순','2014-07-01','010701-4');
insert into member(id,pw,name,reg_date,ssn)
values('hong2','1','홍길동','2015-07-01','301201-1');
insert into member(id,pw,name,reg_date,ssn)
values('hong3','1','홍길동','2015-07-01','501201-1');
insert into member(id,pw,name,reg_date,ssn)
values('choi','1','최진실','2015-07-01','501201-1');

--READ ()// static 개념으로 접근한다
select * from member;-- list
select * from member where id = 'hong';-- findByPK map의 키값
select * from member where gender = '남';-- findByNotPK
select count(*) as count from member;--- count
--UPDATE
update member set pw='999'
where id = 'you';
--delete
delete from member where id = 'you';

drop table member;

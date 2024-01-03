create table testTable
(
    userCode int(20),
    userName varchar(50)
);
insert into testTable values('1234' ,'김연아');
insert into testTable values('5678', '세종대왕');
insert into testTable values('3547', '이도연');
select * from testTable;
commit;
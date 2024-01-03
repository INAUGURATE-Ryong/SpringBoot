DROP TABLE IF EXISTS tab_mybatis;

create table tab_mybatis(
	name varchar(10) primary key,
	email varchar(100),
	phone varchar(11)
);

insert into tab_mybatis 
values ('kiki','thosit@naee.com','01044472343');

insert into tab_mybatis 
values ('haha임','qewdq@naee.com','1234654');

insert into tab_mybatis 
values ('커피임','thosit@naee.com','01044472343');

SELECT * FROM tab_mybatis;
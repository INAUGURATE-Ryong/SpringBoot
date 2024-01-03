select * from users;
drop table users;
CREATE TABLE users (
                       userid INT AUTO_INCREMENT PRIMARY KEY,
                       name VARCHAR(50) NOT NULL,
                       passwd VARCHAR(100) NOT NULL,
                       enabled TINYINT(1) DEFAULT 1,
                       authority VARCHAR(30)
);
INSERT INTO users (name, passwd, enabled, authority) VALUES ('kingsmile', '1', 1, '관리자');
----
CREATE TABLE roll (
                      userid VARCHAR(20),
                      Role_name VARCHAR(30)
);
-- ROLE_USER , ROLE_ADMIN
INSERT INTO roll VALUES('admin', 'ROLE_USER');
INSERT INTO roll VALUES('admin', 'ROLE_ADMIN');
INSERT INTO roll VALUES('simson', 'ROLE_USER');
select * from roll;
----------------------------------------------
select * from roles;
drop table roles;
create table roles(
                      id  number PRIMARY key,
                      name VARCHAR2(20)
);
CREATE SEQUENCE seq_roles;
drop SEQUENCE seq_roles;
INSERT INTO roles(id, name) VALUES(SEQ_ROLES.nextval,'ROLE_USER');
INSERT INTO roles(id, name) VALUES(SEQ_ROLES.nextval,'ROLE_MODERATOR');
INSERT INTO roles(id, name) VALUES(SEQ_ROLES.nextval,'ROLE_ADMIN');
-------------------------------------------------------
select * from user_roles;
drop table user_roles;
create table user_roles(
                           user_id number PRIMARY key,
                           role_id  number not null
);
insert into user_roles(user_id, role_id) values(1, 1);
--insert into user_roles(user_id, role_id) values(2, 1);
update user_roles set role_id = 3 where user_id = 1;
delete user_roles  ;
commit;
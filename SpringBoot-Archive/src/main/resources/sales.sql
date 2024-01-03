
-- 테이블 생성 시 AUTO_INCREMENT로 설정
CREATE TABLE Sales (
    id INT AUTO_INCREMENT PRIMARY KEY,
    item VARCHAR(50) NOT NULL,
    quantity INT NOT NULL,
    amount DECIMAL(18,2)
);

-----------------------------------------------------------
DELIMITER //

CREATE TRIGGER SALE_BEFORE_INSERT_TRG
BEFORE INSERT ON Sales FOR EACH ROW
BEGIN
    IF NEW.id IS NULL THEN
        SET NEW.id = NULL;   -- AUTO_INCREMENT 컬럼이므로 NULL로 설정
    END IF;
END //

DELIMITER ;

-------------------------------------------------------------
INSERT INTO Sales (item, quantity, amount) VALUES ('Product A', 10, 100.50);

SELECT LAST_INSERT_ID();
----------------------------------------------
commit;



















drop table sales;
--------------------------------------------------------
create table Sales 
(
    id number not null enable, 
    item VARCHAR2(50) not null enable, 
    quantity  number(38, 0) not null enable, 
    amount  FLOAT(126),
    CONSTRAINT sales_pk PRIMARY key(id)
);

---------------------------------------------------
drop SEQUENCE sale_sequence;
--------------------------------------------------
CREATE SEQUENCE SALE_SEQUENCE
    MINVALUE 1 
    MAXVALUE 100000 
    INCREMENT BY 1 
    START WITH 1;

select * from sales;
---------------------------------------------------------
CREATE TRIGGER  SALE_PRIMARY_KEY_TRG
   before insert on  Sales
   for each row
    begin 
       if inserting then
          if : NEW.ID is null then
             select SALE_SEQUENCE.nextval into :NEW.ID from dual;
          end if;
        end if;
     end;
--    end loop;


select SALE_SEQUENCE.nextval from dual;
----------------------------------------------
commit;

desc sales;
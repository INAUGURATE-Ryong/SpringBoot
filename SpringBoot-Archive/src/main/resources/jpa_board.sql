drop TABLE jpa_board;

-- 테이블 생성
CREATE TABLE jpa_board (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(20),
    passwd VARCHAR(20),
    title VARCHAR(50),
    content VARCHAR(4000),
    regdate DATE,
    readcount INT,
    reply INT,
    replystep INT,
    replylevel INT
);

-- AUTO_INCREMENT로 설정된 id 컬럼을 생성
-- ALTER TABLE jpa_board ADD COLUMN id INT AUTO_INCREMENT PRIMARY KEY;

-- 데이터 삽입
INSERT INTO jpa_board (name, passwd, title, content, regdate, readcount, reply, replystep, replylevel)
VALUES ('doyeon', '1004', 'title', 'content', NOW(), 0, 0, 0, 0);

SELECT * FROM jpa_board;
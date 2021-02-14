CREATE DATABASE mybatis;
USE mybatis;

CREATE TABLE users
(
   u_id INT NOT NULL,
   u_name CHAR(30) NULL,
   u_password CHAR(30) NULL,
   PRIMARY KEY(u_id)
)ENGINE=INNODB;

INSERT INTO users(u_id,u_name,u_password)
VALUES(1,'Aa','123456'),(2,'Bb','123456'),(3,'Cc','123456');
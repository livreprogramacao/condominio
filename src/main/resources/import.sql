-- You can use this file to load seed data into the database using SQL statements
insert into Member (id, name, email, phone_number) values (0, 'John Smith', 'john.smith@mailinator.com', '2125551212');

--create schema if not exists "CONDOMINIO";

--CALL CSVWRITE('/home/oracle/workspace/condominio/src/main/resources/unidade.csv', 'SELECT * FROM CONDOMINIO.UNIDADE');
--insert into UNIDADE (id, bloco, unidade, tipo, fracao, nome) values (0, 0, 0, 'A', 0, 'TESTE');
--insert into UNIDADE (id, bloco, unidade, tipo, fracao, nome) select * from CSVREAD('/home/oracle/workspace/condominio/src/main/resources/unidade.csv');

create schema if not exists "CONDOMINIO";
drop table CONDOMINIO.UNIDADE;

   create table CONDOMINIO.UNIDADE (
        id bigint not null,
        bloco int not null,
        unidade int not null,
        tipo varchar(1) not null,
        fracao DOUBLE,
        nome varchar(50) not null,
        primary key (id),
        unique (unidade)
    );


insert into CONDOMINIO.UNIDADE (id, bloco, unidade, tipo, fracao, nome) values (0, 0, 0, 'A', 0, 'TESTE');

select * from condominio.unidade ;

CALL CSVWRITE('/home/oracle/workspace/condominio/src/main/resources/unidade.csv', 'SELECT * FROM CONDOMINIO.UNIDADE');

delete from  CONDOMINIO.UNIDADE;
select * from condominio.unidade ;

insert into CONDOMINIO.UNIDADE (id, bloco, unidade, tipo, fracao, nome) select * from CSVREAD('/home/oracle/workspace/condominio/src/main/resources/unidade.csv');
select * from condominio.unidade ;

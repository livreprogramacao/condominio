create schema if not exists "CONDOMINIO";
create user if not exists "dbo" password 'dbo';

--CSVREAD(fileNameString [, columnsString [, csvOptions ] ] )
--Unidade,Nome,,,Tipo,Fração Unidade
--call CSVREAD('/home/oracle/Downloads/condominio/unidades/Cadastro de unidades.csv', 'Unidade,Nome,,,Tipo,Fração');
--select "Unidade", "Nome", "Tipo", "Fração" from CSVREAD('/home/oracle/Downloads/condominio/unidades/Cadastro de unidades.csv', 'Unidade,Nome,,,Tipo,Fração');

SchemaExport schemaExport1 = new SchemaExport(cfg1); // there are various c-tors available
schemaExport1.setInputFile("/import-1.sql");
schemaExport1.create(false, true);

SchemaExport schemaExport2 = new SchemaExport(cfg2);
schemaExport2.setInputFile("/import-2.sql");
schemaExport2.create(false, true);


insert into Cozinha (nome) values ('Italiana');
insert into Cozinha (nome) values ('Japonesa');
insert into Cozinha (nome) values ('Francesa');


insert into Estado (nome) values ('PIAUÍ');
insert into Estado (nome) values ('BAHIA');
insert into Estado (nome) values ('PERNAMBUCO');
insert into Estado (nome) values ('MINAS GERAIS');
insert into Estado (nome) values ('MARANHÃO');

insert into Cidade(nome,estado_id) values('TERESINA',1);
insert into Cidade(nome, estado_id)values('SALVADOR',2);
insert into Cidade(nome,estado_id)values('RECIFE',3);
insert into Cidade(nome, estado_id)values('BELO HORIZONTE',4);
insert into Cidade(nome,estado_id)values('SÃO LUIS',5);

insert into restaurante (id, nome, taxa_frete, cozinha_id) values (1, 'Thai Gourmet', 10, 1);
insert into restaurante (id, nome, taxa_frete, cozinha_id) values (2, 'Thai Delivery', 9.50, 1);
insert into restaurante (id, nome, taxa_frete, cozinha_id) values (3, 'Tuk Tuk Comida Indiana', 15, 2);

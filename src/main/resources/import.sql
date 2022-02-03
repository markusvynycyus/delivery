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

nsert into restaurante (id, nome, taxa_frete, cozinha_id, endereco_cidade_id, endereco_cep, endereco_logradouro, endereco_numero, endereco_bairro) values (1, 'Thai Gourmet', 10, 1, 1, '38400-999', 'Rua João Pinheiro', '1000', 'Centro');
insert into restaurante (id, nome, taxa_frete, cozinha_id) values (2, 'Thai Delivery', 9.50, 1);
insert into restaurante (id, nome, taxa_frete, cozinha_id) values (3, 'Tuk Tuk Comida Indiana', 15, 2);

insert into formapagamento (id, descricao) values (1, 'Cartão de crédito');
insert into formapagamento (id, descricao) values (2, 'Cartão de débito');
insert into formapagamento (id, descricao) values (3, 'Dinheiro');

insert into restaurante_forma_pagamento (restaurante_id, forma_pagamento_id) values (1, 1), (1, 2), (1, 3), (2, 3), (3, 2), (3, 3);

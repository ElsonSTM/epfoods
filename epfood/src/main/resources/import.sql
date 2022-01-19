insert into cozinha (id, nome) values (1, 'Brasileira');
insert into cozinha (id, nome) values (2, 'Americana');

insert into estado (id, nome) values (1, 'Minas Gerais');
insert into estado (id, nome) values (2, 'Amazonas');
insert into estado (id, nome) values (3, 'Pará');
insert into estado (id, nome) values (4, 'São Paulo');

insert into cidade (id, nome, estado_id) values (1, 'Belo Horizonte', 1);
insert into cidade (id, nome, estado_id) values (2, 'Contagem', 1);
insert into cidade (id, nome, estado_id) values (3, 'Belem', 3);
insert into cidade (id, nome, estado_id) values (4, 'Santarém', 3);
insert into cidade (id, nome, estado_id) values (5, 'Manaus', 2);
insert into cidade (id, nome, estado_id) values (6, 'São Paulo', 4);

insert into restaurante (id, nome, taxa_frete, cozinha_id, endereco_cidade_id, endereco_cep, endereco_logradouro, endereco_numero, endereco_bairro) values (1, 'Churrasco', 10, 1, 4, '68030-670', 'Trv. Arapiuns', '1481', 'Aparecida');
insert into restaurante (id, nome, taxa_frete, cozinha_id) values (2, 'Tropeiro', 9.50, 1);
insert into restaurante (id, nome, taxa_frete, cozinha_id) values (3, 'Hamburguer', 15, 2);

insert into forma_pagamento (id, descricao) values (1, 'cartão de crédito');
insert into forma_pagamento (id, descricao) values (2, 'cartão de débito');
insert into forma_pagamento (id, descricao) values (3, 'Dinheiro');
insert into forma_pagamento (id, descricao) values (4, 'Pix');

insert into permissao(id, nome, descricao) values (1, 'CONSULTAR_COZINHA', 'Permite consultar cozinhas');
insert into permissao(id, nome, descricao) values (2, 'EDITAR_COZINHA', 'Permite editar cozinhas');

insert into restaurante_forma_pagamento (restaurante_id, forma_pagamento_id) values (1, 1), (1, 2), (1, 3), (2, 3), (3, 2), (3, 3);

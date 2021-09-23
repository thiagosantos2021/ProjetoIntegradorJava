create database gestao_estoque
;use gestao_estoque
;create table tbl_cliente(
id_cliente serial auto_increment,
cli_nome varchar(300),
cli_endereco varchar(350),
cli_bairro varchar(300),
cli_cidade varchar(200),
cli_uf varchar(2),
cli_cep varchar(9),
cli_telefone varchar(15),
primary key (id_cliente)
);

create table tbl_forma_pagamento(
id_forma_pagamento serial auto_increment,
descricao_forma_pag varchar(255),
desconto_forma_pag float,
quant_parcelas int,
situacao int,
primary key (id_forma_pagamento)
);

create table tbl_produto(
id_produto serial auto_increment,
nome_produto varchar(300),
valor_produto double,
estoque_produto int,
primary key (id_produto)
);

create table tbl_funcionario(
id_func serial auto_increment,
nome_func varchar(150),
login_func varchar(100),
senha_func varchar(20),
primary key(id_func)
);

create table tbl_vendas(
id_vendas serial primary key auto_increment,
fk_cliente bigint unsigned,
data_venda date,
valor_liquido double,
valor_bruto double,
vendas_desconto double,
index(fk_cliente)
);

create table tbl_vendas_produtos(
id_vendas_produtos serial auto_increment,
fk_produto bigint unsigned,
fk_vendas bigint unsigned,
valor_vendas_produtos double,
vendas_produtos_quantidade int,
primary key (id_vendas_produtos),
index(fk_produto),
index(fk_vendas)
);



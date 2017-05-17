create table user(
	us_codigo integer(10) not null auto_increment primary key,
	us_nome varchar(15) not null,
	us_sobrenome varchar(15) not null,
	us_idade integer(3) not null,
	us_email varchar(50) not null,
	us_telefone varchar(11) not null,
	us_login varchar(40) not null,
	us_senha varchar(50) not null
);

create table cliente(
	cl_codigo integer(10) not null auto_increment primary key,
	cl_nome varchar(15) not null,
	cl_sobrenome varchar(15) not null,
	cl_idade integer(3) not null,
	cl_email varchar(50) not null,
	cl_telefone varchar(11) not null,
	cl_us_codigo integer(6) not null,
	constraint cl_us_fk foreign key(cl_us_codigo) references user(us_codigo)
);

create table produto(
	pr_codigo integer not null auto_increment primary key,
	pr_nome varchar(45) not null,
	pr_tipo varchar(45) not null,
	pr_qtdEstoque integer(10) not null,
	pr_valorCompra float not null,
	pr_valorVenda float not null,
	pr_us_codigo integer not null,
	constraint pr_us_fk foreign key(pr_us_codigo) references user(us_codigo)
);

create table pedido(
	pe_codigo integer(10) not null auto_increment primary key,
	pe_us_codigo integer not null,
	constraint pe_us_fk foreign key(pe_us_codigo) references user(us_codigo),
	pe_cl_codigo integer not null,
	constraint pe_cl_fk foreign key(pe_cl_codigo) references cliente(cl_codigo)
);
create table ped_produtos(
	pp_codigo integer(10) not null auto_increment primary key,
	pp_pr_codigo integer not null,
	constraint pp_pr_fk foreign key(pp_pr_codigo) references produto(pr_codigo),
	pp_pe_codigo integer not null,
	constraint pp_pe_fk foreign key(pp_pe_codigo) references pedido(pe_codigo)
);
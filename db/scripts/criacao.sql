CREATE TABLE "sabor" (
    id int not null primary key,
    nome varchar(100) not null
);

CREATE TABLE "telefone" (
    id int not null primary key,
    ddd varchar(3) not null,
    numero varchar(9) not null
);

CREATE TABLE "endereco" (
    id int not null primary key,
    rua varchar(250),
    bairro varchar(100) not null,
    numero int
);

CREATE TABLE "lanche" (
    id int not null primary key,
    nome varchar(100) not null,
    id_sabor int not null references sabor(id)
);

CREATE TABLE "usuario" (
    id int not null primary key,
    nome varchar(250) not null,
    email varchar(100) not null,
    id_telefone int not null references telefone(id),
    id_endereco int not null references endereco(id)
);

CREATE TABLE "pedido" (
    id int not null primary key,
    id_usuario int not null references usuario(id),
    id_lanche int not null references lanche(id)
);

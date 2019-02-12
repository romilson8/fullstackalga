CREATE TABLE categoria (
codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO categoria (nome) values ('Lazer');
INSERT INTO categoria (nome) values ('Alimentação');
INSERT INTO categoria (nome) values ('Supermercado');
INSERT INTO categoria (nome) values ('Famácia');
INSERT INTO categoria (nome) values ('Casar');
INSERT INTO categoria (nome) values ('Brincar');
INSERT INTO categoria (nome) values ('Pular');
INSERT INTO categoria (nome) values ('Pegapega');
INSERT INTO categoria (nome) values ('Pular cordas');
INSERT INTO categoria (nome) values ('Outros');
CREATE TABLE pessoa(
codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(20) NOT NULL,
lagradouro VARCHAR(50),
numero VARCHAR(10),
complemento VARCHAR(20),
bairro VARCHAR(15),
cep VARCHAR(9),
cidade VARCHAR(15),
estado VARCHAR(15),
ativo BOOLEAN
);

INSERT INTO pessoa(nome, lagradouro, numero, complemento, bairro, cep, cidade, estado, ativo)
VALUES("Jose romilson", "Rua Viriato Correia", "71", "apt 803", "boa viagem", "51030-510",
"Recife", "Pernambuco", true);

INSERT INTO pessoa(nome, lagradouro, numero, complemento, bairro, cep, cidade, estado, ativo)
VALUES("Jose Romero", "Afogados", "71", "casa 3", "rua sem nome", "51000-000",
"Sertão", "Pernambuco", false);
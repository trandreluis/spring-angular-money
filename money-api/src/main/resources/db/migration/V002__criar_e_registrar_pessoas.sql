CREATE TABLE pessoa(
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	ativo BOOLEAN DEFAULT NULL,
	logradouro VARCHAR(50) NOT NULL,
	numero VARCHAR(6) NOT NULL,
	complemento VARCHAR(20) NOT NULL,
	bairro VARCHAR(25) NOT NULL,
	cep VARCHAR(10) NOT NULL,
	cidade VARCHAR(30) NOT NULL,
	estado VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado)
VALUES ('Severino', 1, 'Rua Nova', '10', 'Casa azul', 'Centro', '56900-000', 'Monteiro', 'Paraíba');

INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado)
VALUES ('Cleyton', 0, 'Rua Velha', '19', 'Orelhão', 'Antigo', '84903-000', 'Olinda', 'Pernambuco');

INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado)
VALUES ('André', 1, 'Av. Pres. Vargas', '10', 'Apt', 'Cabedelo', '37821-542', 'Prata', 'Paraíba');

INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado)
VALUES ('Davi', 0, 'Rua 7', '8', 'Janelas verdes', 'Tamarineira', '325089-88', 'Serra Talhada', 'Pernambuco');

INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado)
VALUES ('Vanderlan', 1, 'Av. Treze de Julho', '43', 'Capão', 'Maldivas', '62966-093', 'Salvador', 'Bahia');

INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado)
VALUES ('Luís', 1, 'Rua da Ferrovia', '76', 'Terceiro andar', 'Lusitana', '87098-491', 'Curituba', 'Paraná');
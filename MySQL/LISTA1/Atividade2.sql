-- CREATE: Crie um banco de dados para um e commerce
CREATE DATABASE db_ecommerce ;
USE db_ecommerce;

-- CREATE: Crie uma tabela produtos e determine 5 atributos
CREATE TABLE tb_produto (
	id_produto INT AUTO_INCREMENT,
	nome VARCHAR(50),
	cor VARCHAR (50),
	valor INT,
	estoque INT,
	PRIMARY KEY (id_produto)
);

-- INSERT: Popule esta tabela com até 8 dados
INSERT INTO tb_produto (nome, cor, valor, estoque)
VALUES ("Camisa", "Rosa", 250, 5),
("Vestido", "Branca", 560, 10),
("Vestido", "Preta", 420, 7),
("Calça", "Azul", 160, 8),
("Camisa", "Verde", 650, 5),
("Calça", "Preta", 520, 10),
("Camisa", "Azul", 300, 8),
("Vestido", "Verde", 820, 5);

-- SELECT: Faça um select que retorne os produtos com o valor maior do que 500.
SELECT * FROM tb_produto
WHERE valor > 500;
-- SELECT: Faça um select que retorne os produtos com o valor menor do que 500.
SELECT * FROM tb_produto
WHERE valor < 500;

-- UPDATE: Reabastecer o estoque das camisas (nome = "Camisa")
UPDATE tb_produto 
SET estoque = 10
WHERE nome = 'Camisa' ;


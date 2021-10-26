-- CREATE: Crie um banco de dados para um serviço de pizzaria
CREATE DATABASE db_pizzaria_legal;
USE db_pizzaria_legal;

-- CREATE: Crie 2 tabelas tb_pizza e tb_categoria
CREATE TABLE tb_categoria (
id_cat INT AUTO_INCREMENT,
tipo VARCHAR(50) NOT NULL,
retirada ENUM ("VIAGEM", "LOCAL") NOT NULL,
PRIMARY KEY (id_cat)
);

CREATE TABLE tb_pizza (
id_pizza INT AUTO_INCREMENT,
sabor VARCHAR(50),
preco DOUBLE,
borda VARCHAR (50) NOT NULL,
fk_cat INT,
PRIMARY KEY (id_pizza),
FOREIGN KEY (fk_cat) REFERENCES tb_categoria(id_cat)
);

-- INSERT: Popule esta tabela Categoria com até 5 dados
INSERT INTO tb_categoria (tipo, retirada)
VALUES ("Salgada", "Local"),
("Salgada", "Viagem"),
("Doce", "Local"),
("Doce", "Viagem"),
("Misto", "Local"),
("Misto", "Viagem");

-- INSERT: Popule esta tabela pizza com até 8 dados
INSERT INTO tb_pizza(sabor, preco, borda, fk_cat)
VALUES ("Muçarela", 25, "Cheddar", 1),
("Marguerita", 25, "Catupiry", 2),
("Camarão", 65, "Catupiry", 1),
("Bacon", 55, "Brigadeiro", 6),
("Picanha", 65, "Catupiry", 2),
("Portuguesa", 35, "Cheddar", 1),
("Brigadeiro", 25, "Brigadeiro", 3),
("Nutella", 55, "Brigadeiro", 4);

-- SELECT: Retorne os Produtos com o valor maior do que 45 reais
SELECT * FROM tb_pizza
WHERE preco > 45;

-- SELECT: Retorne os produtos com valor entre 29 e 60 reais
SELECT * FROM tb_pizza
WHERE preco > 29 AND preco < 60;

-- SELECT: Faça um select utilizando LIKE buscando os Produtos com a letra C
SELECT * FROM tb_pizza
WHERE sabor LIKE 'C%';

-- INNER JOIN: Um select com Inner join entre tabela categoria e pizza
SELECT tb_categoria.tipo , tb_pizza.sabor, tb_pizza.borda 
FROM tb_categoria 
INNER JOIN tb_pizza ON tb_categoria.id_cat = tb_pizza.fk_cat;

-- INNER JOIN: 
SELECT tb_categoria.tipo, tb_pizza.sabor
FROM tb_categoria
INNER  JOIN tb_pizza ON tb_categoria.id_cat = tb_pizza.fk_cat
WHERE tb_categoria.tipo = "Doce";

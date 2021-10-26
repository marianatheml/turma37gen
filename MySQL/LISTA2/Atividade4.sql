-- CREATE: Crie um banco de dados para um serviço de farmácia
CREATE DATABASE db_cidade_das_frutas;

USE db_cidade_das_frutas;

-- CREATE: Crie 2 tabelas tb_produto e tb_categoria.
CREATE table tb_categoria (
	id_cat INT AUTO_INCREMENT,
	categoria VARCHAR(50),
	corredor VARCHAR(2),
	PRIMARY KEY (id_cat)
);

CREATE table tb_produto (
	id_produto INT AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	valor INT NOT NULL,
	vencimento DATE NOT NULL,
	fk_cat INT,	
	PRIMARY KEY (id_produto),
	FOREIGN KEY (fk_cat) REFERENCES tb_categoria(id_cat)
);


-- INSERT: Popule esta tabela classe com até 5 dados.
INSERT into tb_categoria(categoria, corredor)
	values ("Legumes", "1A"),
	("Frutas", "2A"),
	("Grãos", "1B"),
	("Verduras", "3A"),
	("Hortaliças", "2B");

-- INSERT: Popule esta tabela classe com até 8 dados.
INSERT into tb_produto (nome, valor , vencimento , fk_cat)
	values ("Repolho", 15, "2022-03-22", 4),
	("Banana", 17, "2022-06-01", 2),
	("Alho-poro", 25, "2025-12-01", 4),
	("Maçã", 30, "2025-12-01", 2),
	("Pimentão amarelo", 55, "2022-01-09",1),
	("Cenoura", 5, "2023-01-01", 1),
	("Arroz ", 62, "2023-10-30", 3),
	("Couve-flor", 2, "2023-05-01", 5);

-- SELECT: Retorne os personagens com o poder de ataque maior do que 50.
SELECT * FROM tb_produto 
WHERE valor > 50;

-- SELECT: Retorne os personagens com o poder de defesa entre 3 e 60.
SELECT * FROM tb_produto tp 
WHERE valor BETWEEN 3 AND 60;

-- SELECT: Faça um select utilizando LIKE buscando os produtos com a letra c.
SELECT * FROM tb_produto tp 
WHERE nome LIKE 'C%';

-- INNER JOIN: Faça um um select com Inner join entre tabela categoria e produto.
SELECT tb_categoria.categoria , tb_categoria.corredor , tb_produto.nome 
FROM tb_categoria 
INNER JOIN tb_produto on tb_categoria.id_cat = tb_produto.fk_cat ; 

-- INNER JOIN: Faça um select onde traga todos os Produtos de uma categoria específica.
SELECT tb_categoria.categoria , tb_categoria.corredor , tb_produto.nome 
FROM tb_categoria 
INNER JOIN tb_produto on tb_categoria.id_cat = tb_produto.fk_cat 
WHERE tb_categoria.categoria = 'Frutas' ;

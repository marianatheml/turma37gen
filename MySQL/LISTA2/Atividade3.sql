-- CREATE: Crie um banco de dados para um serviço de farmácia
CREATE DATABASE db_farmacia_do_bem;

USE db_farmacia_do_bem;

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
	values ("Medicamentos", "1A"),
	("Perfumaria", "2A"),
	("Sumplementos", "1B"),
	("Alimentos", "3A"),
	("Beleza", "2B");

-- INSERT: Popule esta tabela classe com até 8 dados.
INSERT into tb_produto (nome, valor , vencimento , fk_cat)
	values ("Dorflex", 15, "2022-03-22", 1),
	("Benegrip", 17, "2022-06-01", 1),
	("Shampoo", 25, "2025-12-01", 2),
	("Condicionador", 30, "2025-12-01", 2),
	("Vitamina C com Zinco", 55, "2022-01-09", 3),
	("Whey Protein", 120, "2023-01-01", 3),
	("Esmalte ", 2, "2023-10-30", 5),
	("Barra de Cereal", 2, "2023-05-01", 4);

-- SELECT: Retorne os personagens com o poder de ataque maior do que 50.
SELECT * FROM tb_produto 
WHERE valor > 50;

-- SELECT: Retorne os personagens com o poder de defesa entre 3 e 60.
SELECT * FROM tb_produto tp 
WHERE valor BETWEEN 3 AND 60;

-- SELECT: Faça um select utilizando LIKE buscando os produtos com a letra B.
SELECT * FROM tb_produto tp 
WHERE nome LIKE 'B%';

-- INNER JOIN: Faça um um select com Inner join entre tabela categoria e produto.
SELECT tb_categoria.categoria , tb_categoria.corredor , tb_produto.nome 
FROM tb_categoria 
INNER JOIN tb_produto on tb_categoria.id_cat = tb_produto.fk_cat ; 

-- INNER JOIN: Faça um select onde traga todos os Produtos de uma categoria específica.
SELECT tb_categoria.categoria , tb_categoria.corredor , tb_produto.nome 
FROM tb_categoria 
INNER JOIN tb_produto on tb_categoria.id_cat = tb_produto.fk_cat 
WHERE tb_categoria.categoria = 'Medicamentos' ;

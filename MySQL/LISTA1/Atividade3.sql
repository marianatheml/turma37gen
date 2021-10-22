-- CREATE: Crie um banco de dados para um registro de uma escola,
CREATE DATABASE db_escola ;
USE db_escola;

-- CREATE: Crie uma tabela estudantes e determine 5 atributos
CREATE TABLE tb_estudantes (
	id_alune INT AUTO_INCREMENT,
	alune VARCHAR(50),
	data_aniversario DATE,
	ano VARCHAR(4),
	nota_media INT,
	PRIMARY KEY (id_alune)
);

-- INSERT: Popule esta tabela com até 8 dados
INSERT INTO tb_estudantes (alune, data_aniversario, ano, nota_media)
VALUES ("Maria", "2015-10-25", "1ºA", 5),
("Joana", "2015-05-02", "1ºA", 8),
("Vitoria", "2016-12-16", "2ºB", 8),
("Luiz", "2015-03-30", "1ºC", 6),
("Leandro", "2015-10-13", "2ºA", 2),
("Ana", "2014-12-13", "1ºA", 10),
("Julio", "2015-01-05", "1ºB", 9),
("Sara", "2016-04-22", "2ºC", 6);

-- SELECT: Faça um select que retorne os estudantes com a nota maior do que 7.
SELECT * FROM tb_estudantes
WHERE nota_media > 7;
-- SELECT: Faça um select que retorne os estudantes com a nota menor do que 7.
SELECT * FROM tb_estudantes
WHERE nota_media < 7;

-- UPDATE: Corrigir a nota de Leandro (alune = "Leandro")
UPDATE tb_estudantes 
SET nota_media = 7
WHERE alune = 'Leandro' ;


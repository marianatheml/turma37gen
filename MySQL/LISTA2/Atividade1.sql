-- CREATE: Crie um banco de dados para um serviço de um game Online
CREATE DATABASE bd_generation_game_online;

USE bd_generation_game_online;

-- CREATE: Crie 2 tabelas tb_personagem e tb_classe.
CREATE table tb_classe (
	id_classe INT AUTO_INCREMENT,
	nome VARCHAR(50),
	habilidade VARCHAR(50),
	PRIMARY KEY (id_classe)
);

CREATE table tb_personagem (
	id_personagem INT AUTO_INCREMENT,
	nome VARCHAR(50),
	ataque INT,
	defesa INT,
	fk_classe INT,	
	PRIMARY KEY (id_personagem),
	FOREIGN KEY (fk_classe) REFERENCES tb_classe(id_classe)
);


-- INSERT: Popule esta tabela classe com até 5 dados.
INSERT into tb_classe(nome, habilidade)
	values ("Arqueiro", "Precisão"),
	("Lutador", "Força"),
	("Assassino", "Velocidade"),
	("Mago", "Magia"),
	("Sacerdote", "Cura");

-- INSERT: Popule esta tabela classe com até 5 dados.
INSERT into tb_personagem (nome, ataque, defesa, fk_classe)
	values ("Gandalf", 2600, 1500, 4),
	("Thomas Shelby", 2400, 1800, 3),
	("Rapunzel", 1500, 1800, 5),
	("Dumbledore", 2400, 3100, 4),
	("Creed", 3000, 2100, 2),
	("Valente", 1800, 1500, 1),
	("Eren Yeager ", 2100, 3100, 2),
	("Hank", 2100, 1800, 1);

-- SELECT: Retorne os personagens com o poder de ataque maior do que 2000.
SELECT * FROM tb_personagem
WHERE ataque > 2000;

-- SELECT: Retorne os personagens com o poder de defesa entre 1000 e 2000.
SELECT * FROM tb_personagem
WHERE defesa > 1000
AND defesa < 2000;

-- SELECT: Faça um select utilizando LIKE buscando os personagens com a letra C.
SELECT * FROM tb_personagem
WHERE nome LIKE 'C%';

-- INNER JOIN: Entre tabela classe e personagem.
SELECT tb_classe.nome , tb_classe.habilidade , tb_personagem.nome 
FROM tb_classe
INNER JOIN tb_personagem on tb_classe.id_classe = tb_personagem.fk_classe ; 

-- INNER JOIN: Traga todos os personagem de uma classe específica
SELECT tb_classe.nome , tb_personagem.nome, tb_personagem.ataque, tb_personagem.defesa 
FROM tb_classe
INNER JOIN tb_personagem on tb_classe.id_classe = tb_personagem.fk_classe 
WHERE tb_classe.nome = 'Arqueiro' ;

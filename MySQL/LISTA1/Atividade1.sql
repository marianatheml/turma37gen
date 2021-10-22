-- CREATE 
CREATE DATABASE db_rh ;
USE db_rh;

CREATE TABLE tb_funcionarios (
	id_funcionario INT AUTO_INCREMENT,
	nome VARCHAR(50),
	email VARCHAR (50),
	data_nascimento DATE,
	salario INT,
	PRIMARY KEY (id_funcionario)
);

-- INSERT: Popule esta tabela com até 5 dados
INSERT INTO tb_funcionarios (nome, email, data_nascimento, salario)
VALUES ("Mariana", "mariana@mail.com","2000-10-25",1500),
("Luiz", "luiz@mail.com","1994-05-02",3200),
("Julia", "julia@mail.com","1994-12-16",2500),
("Beatriz", "beatriz@mail.com","1992-03-30",1800),
("Carla", "carla@mail.com","1994-10-13",1500);

-- SELECT: Faça um select que retorne os funcionaries com o salário maior do que 2000
SELECT * FROM tb_funcionarios tf
WHERE salario > 2000;
-- SELECT: Faça um select que retorne os funcionaries com o salário menor do que 2000
SELECT * FROM tb_funcionarios tf
WHERE salario < 2000;
-- UPDATE: Aumento de salario de Mariana (id_funcionario = 1)
UPDATE tb_funcionarios 
SET salario = 5000
WHERE id_funcionario = 1;

SELECT * FROM tb_funcionarios tf ;

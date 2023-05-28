INSERT INTO tb_categoria(descricao) VALUES ('Ingles');
INSERT INTO tb_categoria(descricao) VALUES ('html');


INSERT INTO tb_participante(nome, email)VALUES('matheus rocha', 'matheus@gmail.com');
INSERT INTO tb_participante(nome, email)VALUES('Luiz', 'Luiz@gmail.com')
INSERT INTO tb_participante(nome, email)VALUES('matheus', 'matheus@gmail.com');
INSERT INTO tb_participante(nome, email)VALUES('fabio', 'fabio@gmail.com')

INSERT INTO tb_atividade(nome, descricao, preco, categoria_id)VALUES ('Curso Ingles','Aprenda a falar Ingles','90.0',1);
INSERT INTO tb_atividade(nome, descricao, preco, categoria_id)VALUES ('Curso html','Aprenda html praticando','95.0',2);

INSERT INTO tb_bloco(inicio, fim, atividade_id) VALUES(TIMESTAMP WITH TIME ZONE '2023-05-20T14:00:00Z', TIMESTAMP WITH TIME ZONE '2023-09-25T18:00:00Z', 1);
INSERT INTO tb_bloco(inicio, fim, atividade_id) VALUES(TIMESTAMP WITH TIME ZONE '2023-05-20T14:00:00Z', TIMESTAMP WITH TIME ZONE '2023-09-25T18:00:00Z', 2);
INSERT INTO tb_bloco(inicio, fim, atividade_id) VALUES(TIMESTAMP WITH TIME ZONE '2023-05-20T14:00:00Z', TIMESTAMP WITH TIME ZONE '2023-09-25T18:00:00Z', 2);

INSERT INTO tb_participante_atividade (participante_id, atividade_id) VALUES(1, 1);
INSERT INTO tb_participante_atividade (participante_id, atividade_id) VALUES(1, 2);
INSERT INTO tb_participante_atividade (participante_id, atividade_id) VALUES(2, 1);
INSERT INTO tb_participante_atividade (participante_id, atividade_id) VALUES(3, 1);
INSERT INTO tb_participante_atividade (participante_id, atividade_id) VALUES(3, 2);
INSERT INTO tb_participante_atividade (participante_id, atividade_id) VALUES(4, 2);
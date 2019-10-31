INSERT INTO SIMULADO(id, referencia) VALUES (1, 'MED-2020');

INSERT INTO PROVA(id, referencia) VALUES (1, 'BIOLOGIA-2020');
INSERT INTO QUESTAO(texto, nivel, prova_id) VALUES('As células eucariontes podem ser classificadas em dois grupos principais: células animais e células vegetais. Essas últimas apresentam algumas estruturas exclusivas, tais como os cloroplastos, que são responsáveis pelo processo de fotossíntese. Analise as alternativas a seguir e marque a única estrutura que não pode ser utilizada para diferenciar uma célula vegetal da animal.', 'FACIL', 1);
INSERT INTO ESCOLHA(texto, certo, questao_id) VALUES('a) cromoplastos.', false, 1);
INSERT INTO ESCOLHA(texto, certo, questao_id) VALUES('b) leucoplastos.', false, 1);
INSERT INTO ESCOLHA(texto, certo, questao_id) VALUES('c) vacúolo de suco celular.', false, 1);
INSERT INTO ESCOLHA(texto, certo, questao_id) VALUES('d) mitocôndria.', true, 1);
INSERT INTO ESCOLHA(texto, certo, questao_id) VALUES('e) parede celular.', false, 1);

INSERT INTO PROVA_SIMULADOS(prova_id, simulados_id) VALUES(1, 1);

INSERT INTO SIMULADO(id, referencia) VALUES (1, 'MED-2020');

INSERT INTO PROVA(id, referencia) VALUES (1, 'BIOLOGIA-2020');

INSERT INTO PROVA_SIMULADOS(prova_id, simulados_id) VALUES(1, 1);

--3 fáceis
INSERT INTO QUESTAO(id, referencia, texto, nivel, prova_id) VALUES(1, 1, 'As células eucariontes podem ser classificadas em dois grupos principais: células animais e células vegetais. Essas últimas apresentam algumas estruturas exclusivas, tais como os cloroplastos, que são responsáveis pelo processo de fotossíntese. Analise as alternativas a seguir e marque a única estrutura que não pode ser utilizada para diferenciar uma célula vegetal da animal.', 'FACIL', 1);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('a)', 'cromoplastos.', false, 1);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('b)', 'leucoplastos.', false, 1);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('c)', 'vacúolo de suco celular.', false, 1);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('d)', 'mitocôndria.', true, 1);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('e)', 'parede celular.', false, 1);

INSERT INTO QUESTAO(id, referencia, texto, nivel, prova_id) VALUES(2, 2, 'Vacúolos são estruturas existentes em diferentes tipos celulares, entretanto, o vacúolo de suco celular é uma estrutura típica da célula vegetal. Observe as funções abaixo e marque aquela que não pode ser atribuída ao vacúolo.', 'FACIL', 1);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('a)', 'Atua no armazenamento de substâncias.', false, 2);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('b)', 'Participa do processo de respiração celular.', true, 2);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('c)', 'Realiza a digestão de componentes celulares.', false, 2);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('d)', 'Promove o controle osmótico.', false, 2);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('e)', 'Ajuda na manutenção do pH.', false, 2);

INSERT INTO QUESTAO(id, referencia, texto, nivel, prova_id) VALUES(3, 3, 'Encontrada principalmente em sementes oleaginosas, essa organela converte lipídios em açúcares. Marque a alternativa que indica corretamente o nome da organela a que a afirmação se refere.', 'FACIL', 1);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('a)', 'cromoplastos.', false, 3);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('b)', 'leucoplastos.', false, 3);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('c)', 'vacúolo de suco celular.', false, 3);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('d)', 'mitocôndria.', true, 3);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('e)', 'parede celular.', false, 3);

--4 medias
INSERT INTO QUESTAO(id, referencia, texto, nivel, prova_id) VALUES(4, 4, '(UFSCar) Em uma célula vegetal, o material genético concentra-se no interior do núcleo, o qual é delimitado por uma membrana. Além dessa região, material genético também é encontrado no interior do', 'MEDIO', 1);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('a)', 'cromoplastos.', false, 4);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('b)', 'leucoplastos.', false, 4);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('c)', 'vacúolo de suco celular.', false, 4);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('d)', 'mitocôndria.', true, 4);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('e)', 'parede celular.', false, 4);

INSERT INTO QUESTAO(id, referencia, texto, nivel, prova_id) VALUES(5, 5, '(UFF) O acúmulo de metais pesados no solo, como o cádmio, o zinco e o chumbo, resultante de atividades industriais, tem grande impacto na biota desses locais. Apesar de serem requeridos em pequenas quantidades pelos organismos vivos, o excesso desses metais é tóxico para a maioria das espécies e compromete sua sobrevivência. Algumas espécies de plantas são capazes de crescer em solos que contêm grandes quantidades desses metais. Nas células dessas plantas podem ser encontrados diferentes mecanismos para a resistência a esses metais, como a imobilização por polissacarídeos, a exemplo da pectina, e a formação de complexos com ácidos orgânicos no interior da organela que ocupa o maior volume da célula desenvolvida. Os locais na célula vegetal onde ocorrem os mecanismos citados são, respectivamente:', 'MEDIO', 1);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('a)', 'cromoplastos.', false, 5);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('b)', 'leucoplastos.', false, 5);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('c)', 'vacúolo de suco celular.', false, 5);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('d)', 'mitocôndria.', true, 5);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('e)', 'parede celular.', false, 5);

INSERT INTO QUESTAO(id, referencia, texto, nivel, prova_id) VALUES(6, 6, '', 'MEDIO', 1);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('a)', 'cromoplastos.', false, 6);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('b)', 'leucoplastos.', false, 6);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('c)', 'vacúolo de suco celular.', false, 6);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('d)', 'mitocôndria.', true, 6);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('e)', 'parede celular.', false, 6);

INSERT INTO QUESTAO(id, referencia, texto, nivel, prova_id) VALUES(7, 7, '', 'MEDIO', 1);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('a)', 'cromoplastos.', false, 7);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('b)', 'leucoplastos.', false, 7);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('c)', 'vacúolo de suco celular.', false, 7);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('d)', 'mitocôndria.', true, 7);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('e)', 'parede celular.', false, 7);

--3 dificeis
INSERT INTO QUESTAO(id, referencia, texto, nivel, prova_id) VALUES(8, 8, '', 'DIFICIL', 1);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('a)', 'cromoplastos.', false, 8);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('b)', 'leucoplastos.', false, 8);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('c)', 'vacúolo de suco celular.', false, 8);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('d)', 'mitocôndria.', true, 8);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('e)', 'parede celular.', false, 8);

INSERT INTO QUESTAO(id, referencia, texto, nivel, prova_id) VALUES(9, 9, '', 'DIFICIL', 1);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('a)', 'cromoplastos.', false, 9);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('b)', 'leucoplastos.', false, 9);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('c)', 'vacúolo de suco celular.', false, 9);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('d)', 'mitocôndria.', true, 9);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('e)', 'parede celular.', false, 9);

INSERT INTO QUESTAO(id, referencia, texto, nivel, prova_id) VALUES(10, 10, '', 'DIFICIL', 1);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('a)', 'cromoplastos.', false, 10);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('b)', 'leucoplastos.', false, 10);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('c)', 'vacúolo de suco celular.', false, 10);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('d)', 'mitocôndria.', true, 10);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('e)', 'parede celular.', false, 10);
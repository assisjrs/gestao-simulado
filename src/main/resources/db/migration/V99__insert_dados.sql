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
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('a)', 'vacúolo.', false, 3);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('b)', 'peroxissomo.', false, 3);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('c)', 'plastídio.', false, 3);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('d)', 'glioxissomo.', true, 3);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('e)', 'lisossomo.', false, 3);

--4 medias
INSERT INTO QUESTAO(id, referencia, texto, nivel, prova_id) VALUES(4, 4, '(UFSCar) Em uma célula vegetal, o material genético concentra-se no interior do núcleo, o qual é delimitado por uma membrana. Além dessa região, material genético também é encontrado no interior do', 'MEDIO', 1);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('a)', 'retículo endoplasmático e complexo Golgiense.', false, 4);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('b)', 'complexo Golgiense e cloroplasto.', false, 4);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('c)', 'lisossomo e retículo endoplasmático.', false, 4);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('d)', 'lisossomo e mitocôndria.', false, 4);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('e)', 'cloroplasto e mitocôndria.', true, 4);

INSERT INTO QUESTAO(id, referencia, texto, nivel, prova_id) VALUES(5, 5, '(UFF) O acúmulo de metais pesados no solo, como o cádmio, o zinco e o chumbo, resultante de atividades industriais, tem grande impacto na biota desses locais. Apesar de serem requeridos em pequenas quantidades pelos organismos vivos, o excesso desses metais é tóxico para a maioria das espécies e compromete sua sobrevivência. Algumas espécies de plantas são capazes de crescer em solos que contêm grandes quantidades desses metais. Nas células dessas plantas podem ser encontrados diferentes mecanismos para a resistência a esses metais, como a imobilização por polissacarídeos, a exemplo da pectina, e a formação de complexos com ácidos orgânicos no interior da organela que ocupa o maior volume da célula desenvolvida. Os locais na célula vegetal onde ocorrem os mecanismos citados são, respectivamente:', 'MEDIO', 1);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('a)', 'membrana plasmática e cloroplasto', false, 5);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('b)', 'parede celular e vacúolo', true, 5);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('c)', 'microtúbulo e lisossomo', false, 5);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('d)', 'parede celular e ribossomo', false, 5);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('e)', 'membrana plasmática e vacúolo', false, 5);

--
INSERT INTO QUESTAO(id, referencia, texto, nivel, prova_id) VALUES(6, 6, 'O cérebro é uma parte do encéfalo que corresponde a aproximadamente 80% dessa estrutura e apresenta uma grande quantidade de sulcos e depressões. Marque a alternativa que indica corretamente algumas das funções principais do cérebro:', 'MEDIO', 1);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('a)', 'O cérebro relaciona-se com a coordenação dos movimentos, equilíbrio e postura.', false, 6);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('b)', 'O cérebro relaciona-se com a regulação das funções cardiovasculares, controla a respiração e os reflexos de tosse e espirro.', false, 6);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('c)', 'O cérebro é responsável por processar os impulsos motores e regular a temperatura corpórea.', false, 6);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('d)', 'O cérebro relaciona-se com a linguagem, comportamento emocional e raciocínio.', true, 6);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('e)', 'O cérebro é responsável por controlar a audição, pressão arterial e respiração.', false, 6);

INSERT INTO QUESTAO(id, referencia, texto, nivel, prova_id) VALUES(7, 7, 'Todo o sistema nervoso central (encéfalo e medula espinal) é envolvido por um grupo de três membranas chamadas de meninges. Marque a alternativa que indica corretamente o nome das meninges na sequência da mais externa para a mais interna.', 'MEDIO', 1);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('a)', 'Aracnoide, pia-máter e dura-máter.', false, 7);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('b)', 'Pia-máter, dura-máter e aracnoide.', false, 7);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('c)', 'Aracnoide, dura-máter e pia-máter.', false, 7);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('d)', 'Dura-máter, aracnoide e pia-máter.', true, 7);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('e)', 'Pia-máter, aracnoide e pia-máter.', false, 7);

--3 dificeis
INSERT INTO QUESTAO(id, referencia, texto, nivel, prova_id) VALUES(8, 8, 'A medula espinhal é uma estrutura cilíndrica que se estende desde o forame magno até a segunda vértebra lombar. Essa estrutura está relacionada com respostas simples e rápidas a determinados estímulos, tais como retirar a mão de um objeto quente. Essas respostas são chamadas de respostas reflexas medulares. A respeito das respostas reflexas medulares, marque a alternativa correta.', 'DIFICIL', 1);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('a)', 'Nesse tipo de resposta, o encéfalo manda rapidamente um estímulo, sem que seja necessária a interferência da medula.', false, 8);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('b)', 'A medula leva rapidamente o estímulo ao cérebro que produz uma resposta reflexa extremamente rápida.', false, 8);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('c)', 'Nesse processo, não há intervenção do encéfalo, sendo a medula a responsável por gerar a resposta.', true, 8);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('d)', 'Nas respostas reflexas medulares, o cérebro gera uma resposta e envia para a medula, que processa e responde ao estímulo.', false, 8);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('e)', 'Nenhuma das anteriores', false, 8);

INSERT INTO QUESTAO(id, referencia, texto, nivel, prova_id) VALUES(9, 9, '(Fuvest- SP) Qual dos seguintes comportamentos envolve maior número de órgãos do sistema nervoso?', 'DIFICIL', 1);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('a)', 'Salivar ao sentir o aroma de comida gostosa.', false, 9);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('b)', 'Levantar a perna quando o médico toca com martelo no joelho do paciente.', false, 9);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('c)', 'Piscar com a aproximação brusca de um objeto.', false, 9);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('d)', 'Retirar bruscamente a mão ao tocar um objeto muito quente.', false, 9);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('e)', 'Preencher uma ficha de identificação.', true, 9);

INSERT INTO QUESTAO(id, referencia, texto, nivel, prova_id) VALUES(10, 10, '(Vunesp-SP) Imagine as seguintes situações: 1- Você vai tomar uma injeção e fica com o braço distendido, recebendo a picada da agulha sem nenhuma reação. 2- Você estava distraído e alguém picou-lhe o braço com um alfinete; a reação foi um salto. Os órgãos do sistema nervoso que controlaram a primeira e a segunda reação foram, respectivamente:', 'DIFICIL', 1);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('a)', 'medula e cérebro.', false, 10);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('b)', 'cerebelo e córtex.', false, 10);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('c)', 'medula e hipotálamo.', false, 10);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('d)', 'cérebro e medula.', true, 10);
INSERT INTO ESCOLHA(referencia, texto, certo, questao_id) VALUES('e)', 'cérebro e neurônio.', false, 10);

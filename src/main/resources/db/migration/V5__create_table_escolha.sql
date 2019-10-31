CREATE TABLE ESCOLHA (
  id bigint AUTO_INCREMENT PRIMARY KEY NOT NULL,
  referencia varchar(2) NOT NULL,
  texto varchar(2000) NOT NULL,
  certo bit NOT NULL,
  questao_id bigint NOT NULL
);

--ALTER TABLE ESCOLHA ADD FOREIGN KEY (questao_id) REFERENCES QUESTAO(id);

CREATE TABLE QUESTAO (
  id bigint AUTO_INCREMENT PRIMARY KEY NOT NULL,
  referencia int NOT NULL,
  texto varchar(2000) NOT NULL,
  nivel varchar(255) NOT NULL,
  prova_id bigint NOT NULL
);

--CREATE INDEX IDX_QUESTAO_texto ON QUESTAO(texto);
--ALTER TABLE QUESTAO ADD FOREIGN KEY (prova_id) REFERENCES PROVA(id);

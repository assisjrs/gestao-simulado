CREATE TABLE PROVA (
  id bigint AUTO_INCREMENT PRIMARY KEY NOT NULL,
  referencia varchar(255) NOT NULL,
  UNIQUE KEY UK_PROVA_referencia(referencia)
);

CREATE INDEX IDX_PROVA_referencia ON PROVA(referencia);

CREATE TABLE PROVA_SIMULADOS (
  prova_id bigint NOT NULL,
  simulados_id bigint NOT NULL,
  UNIQUE KEY UK_PROVA_SIMUALDO_prova_simualdo(prova_id, simulados_id)
);

--ALTER TABLE PROVA_SIMULADOS ADD FOREIGN KEY (prova_id) REFERENCES PROVA(id);
--ALTER TABLE PROVA_SIMULADOS ADD FOREIGN KEY (simulados_id) REFERENCES SIMULADO(id);
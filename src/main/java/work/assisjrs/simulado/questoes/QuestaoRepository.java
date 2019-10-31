package work.assisjrs.simulado.questoes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import work.assisjrs.simulado.provas.Prova;

import java.util.List;

@Repository
public interface QuestaoRepository extends JpaRepository<Questao, Long> {
    @Query("SELECT DISTINCT q FROM Questao q INNER JOIN FETCH q.escolhas e WHERE q.prova = :prova")
    List<Questao> findByProvaFetchEscolhas(Prova prova);

    List<Questao> findByProva(Prova prova);

    @Query("SELECT e FROM Escolha e WHERE e.questao = :questao AND e.certo = true")
    List<Escolha> findEscolhasCertas(Questao questao);
}

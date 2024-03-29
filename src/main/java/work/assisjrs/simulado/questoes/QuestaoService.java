package work.assisjrs.simulado.questoes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import work.assisjrs.simulado.provas.Prova;

import java.util.List;

import static java.util.Collections.emptyList;
import static java.util.Optional.ofNullable;

@Service
public class QuestaoService {

    @Autowired
    private QuestaoRepository repository;

    public List<Questao> findByProvaFetchEscolhas(final Prova prova) {
        return ofNullable(repository.findByProvaFetchEscolhas(prova))
                .orElse(emptyList());
    }

    public List<Questao> findGabarito(Prova prova) {
        final List<Questao> questoes = ofNullable(repository.findByProva(prova))
                .orElse(emptyList());

        questoes.forEach(questao -> questao.setEscolhas(repository.findEscolhasCertas(questao)));

        return questoes;
    }
}

package work.assisjrs.simulado.questoes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import static work.assisjrs.simulado.questoes.Nivel.FACIL;

@RestController
@RequestMapping("/simulados/{referenciaSimulado}/provas/{referenciaProva}")
public class QuestaoResource {

    @Autowired
    private QuestaoService service;

    @GetMapping
    public ResponseEntity<?> get(@PathVariable final String referenciaSimulado, @PathVariable final String referenciaProva) {
        final ProvaComQuestoesResponse provaComQuestoesResponse = new ProvaComQuestoesResponse();
        provaComQuestoesResponse.setQuestoes(new ArrayList<>());

        final QuestaoResponse questaoResponse = new QuestaoResponse();
        questaoResponse.setId(1L);
        questaoResponse.setTexto("Onde fica o DNA?");
        questaoResponse.setNivel(FACIL);

        questaoResponse.setEscolhas(new ArrayList<>());

        final EscolhaResponse escolha = new EscolhaResponse();
        escolha.setId(1L);

        questaoResponse.getEscolhas().add(escolha);

        provaComQuestoesResponse.getQuestoes().add(questaoResponse);

        return ResponseEntity.ok(provaComQuestoesResponse);
    }
}

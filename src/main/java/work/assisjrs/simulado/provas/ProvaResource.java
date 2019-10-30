package work.assisjrs.simulado.provas;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static work.assisjrs.simulado.provas.Nivel.FACIL;

@RestController
@RequestMapping("/simulados/{referenciaSimulado}/provas")
public class ProvaResource {
    @Autowired
    private ProvaService service;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public ResponseEntity<?> get(@PathVariable final String referenciaSimulado) {
        final List<ProvaResponse> provas = modelMapper.map(service.findBySimulado(referenciaSimulado),
                new TypeToken<List<ProvaResponse>>() {}.getType());

        provas.forEach(p -> p.setSimulado(referenciaSimulado));

        return ResponseEntity.ok(provas);
    }

    @GetMapping("/{referenciaProva}")
    public ResponseEntity<?> getQuestoes(@PathVariable final String referenciaSimulado, final String referenciaProva) {
        final List<ProvaComQuestoesResponse> provasComQuestoes = new ArrayList<ProvaComQuestoesResponse>();

        final ProvaComQuestoesResponse provaComQuestoesResponse = new ProvaComQuestoesResponse();
        provaComQuestoesResponse.setQuestoes(new ArrayList<>());

        final QuestaoResponse questaoResponse = new QuestaoResponse();
        questaoResponse.setId(1L);
        questaoResponse.setTexto("Onde fica o DNA?");
        questaoResponse.setNivel(FACIL);

        questaoResponse.setEscolhas(new ArrayList<>());

        final EscolhaResponse escolha = new EscolhaResponse();

        questaoResponse.getEscolhas().add(escolha);

        provaComQuestoesResponse.getQuestoes().add(questaoResponse);

        provasComQuestoes.add(provaComQuestoesResponse);

        return ResponseEntity.ok(provasComQuestoes);
    }
}

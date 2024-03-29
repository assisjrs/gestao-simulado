package work.assisjrs.simulado.questoes;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import work.assisjrs.simulado.provas.Prova;
import work.assisjrs.simulado.provas.ProvaService;

import java.util.List;

@RestController
@RequestMapping("/simulados/{referenciaSimulado}/provas/{referenciaProva}")
public class QuestaoResource {

    @Autowired
    private QuestaoService service;

    @Autowired
    private ProvaService provaService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public ResponseEntity<?> get(@PathVariable final String referenciaSimulado, @PathVariable final String referenciaProva) {
        final ProvaComQuestoesResponse response = new ProvaComQuestoesResponse();
        response.setSimulado(referenciaSimulado);
        response.setProva(referenciaProva);

        final Prova prova = provaService.findBySimuladoAndReferencia(referenciaSimulado, referenciaProva);

        final List<QuestaoResponse> questoesResponse = modelMapper.map(service.findByProvaFetchEscolhas(prova),
                new TypeToken<List<QuestaoResponse>>() {}.getType());

        response.setQuestoes(questoesResponse);

        return ResponseEntity.ok(response);
    }

    @GetMapping("/gabarito")
    public ResponseEntity<?> getGabarito(@PathVariable final String referenciaSimulado, @PathVariable final String referenciaProva) {
        final ProvaComQuestoesResponse response = new ProvaComQuestoesResponse();
        response.setSimulado(referenciaSimulado);
        response.setProva(referenciaProva);

        final Prova prova = provaService.findBySimuladoAndReferencia(referenciaSimulado, referenciaProva);

        final List<QuestaoResponse> questoesResponse = modelMapper.map(service.findGabarito(prova),
                new TypeToken<List<QuestaoResponse>>() {}.getType());

        response.setQuestoes(questoesResponse);

        return ResponseEntity.ok(response);
    }
}

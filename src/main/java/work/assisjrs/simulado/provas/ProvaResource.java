package work.assisjrs.simulado.provas;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}

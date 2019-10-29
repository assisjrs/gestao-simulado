package work.assisjrs.simulado.provas;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import work.assisjrs.simulado.simulados.SimuladoService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/simulados/{referenciaSimulado}/provas")
public class ProvaResource {
    @Autowired
    private SimuladoService service;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public ResponseEntity<?> get(@PathVariable final String referenciaSimulado) {
        final List<ProvaResponse> provas = new ArrayList<>();

        provas.add(new ProvaResponse());

        return ResponseEntity.ok(provas);
    }
}

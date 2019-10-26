package work.assisjrs.simulado.simulados;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static java.util.Optional.ofNullable;

@RestController
@RequestMapping("/simulados")
public class SimuladoResource {
    @Autowired
    private SimuladoService service;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public ResponseEntity<?> get() {
        final List<SimuladoResponse> simulados = new ArrayList<>();

        for (final Simulado simulado: service.all()) {
            simulados.add(modelMapper.map(simulado, SimuladoResponse.class));
        }

        return ofNullable(simulados)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.noContent().build());
    }
}

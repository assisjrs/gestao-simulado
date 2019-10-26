package work.assisjrs.simulado.simulados;

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
    @GetMapping
    public ResponseEntity<?> get() {
        final List<SimuladoResponse> simulados = new ArrayList<>();

        final SimuladoResponse simulado = new SimuladoResponse();

        simulados.add(simulado);

        return ofNullable(simulados)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.noContent().build());
    }
}

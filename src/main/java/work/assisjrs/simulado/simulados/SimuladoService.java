package work.assisjrs.simulado.simulados;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Collections.emptyList;
import static java.util.Optional.ofNullable;

@Service
public class SimuladoService {
    @Autowired
    private SimuladoRepository repository;

    public List<Simulado> all() {
        final List<Simulado> simulados = repository.findAll();

        return ofNullable(simulados)
                .orElse(emptyList());
    }
}

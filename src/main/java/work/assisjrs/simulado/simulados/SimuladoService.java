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
        return ofNullable(repository.findAll())
                .orElse(emptyList());
    }

    public Simulado findByReferencia(final String referencia) {
        return ofNullable(repository.findByReferencia(referencia))
                .orElseThrow(() -> new SimuladoNaoEncontradoException("Nenhum simulado encontrado com a referência " + referencia));
    }
}

package work.assisjrs.simulado.simulados;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SimuladoService {
    public List<Simulado> all() {
        final List<Simulado> simulados = new ArrayList<>();

        final Simulado simulado = new Simulado();

        simulados.add(simulado);

        return simulados;
    }
}

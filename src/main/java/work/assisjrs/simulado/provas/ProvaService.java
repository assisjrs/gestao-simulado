package work.assisjrs.simulado.provas;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProvaService {
    public List<Prova> findBySimulado(final String referenciaSimulado) {
        final List<Prova> provas = new ArrayList<>();

        provas.add(new Prova());
        return provas;
    }
}

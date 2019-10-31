package work.assisjrs.simulado.provas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import work.assisjrs.simulado.simulados.Simulado;
import work.assisjrs.simulado.simulados.SimuladoService;

import java.util.List;

import static java.util.Collections.emptyList;
import static java.util.Optional.ofNullable;

@Service
public class ProvaService {
    @Autowired
    private ProvaRepository repository;

    @Autowired
    private SimuladoService simuladoService;

    public List<Prova> findBySimulado(final String referenciaSimulado) {
        final Simulado simulado = simuladoService.findByReferencia(referenciaSimulado);

        return ofNullable(repository.findBySimulados(simulado))
                .orElse(emptyList());
    }

    public Prova findBySimuladoAndReferencia(final String referenciaSimulado, final String referenciaProva) {
        final Simulado simulado = simuladoService.findByReferencia(referenciaSimulado);
        return ofNullable(repository.findBySimuladosAndReferencia(simulado, referenciaProva))
                .orElseThrow(() -> new ProvaNaoEncontradaException("Nenhuma prova com referencia " + referenciaProva + " foi encontrada para o simulado com a referência " + referenciaSimulado));
    }
}

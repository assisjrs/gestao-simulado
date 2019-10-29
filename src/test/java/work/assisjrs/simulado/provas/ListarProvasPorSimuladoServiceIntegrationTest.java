package work.assisjrs.simulado.provas;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ListarProvasPorSimuladoServiceIntegrationTest {
    @Autowired
    private ProvaService service;

    @Test
    public void deve_listar_simulados() {
        final List<Prova> provas = service.findBySimulado("MED-2018-FOR");

        assertThat(provas).isNotEmpty();
    }
}

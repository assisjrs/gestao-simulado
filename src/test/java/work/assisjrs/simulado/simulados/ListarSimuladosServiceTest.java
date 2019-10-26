package work.assisjrs.simulado.simulados;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ListarSimuladosServiceTest {
    @Autowired
    private SimuladoService service;

    @Test
    public void deve_listar_simulados() {
        final List<Simulado> simulados = service.all();

        assertThat(simulados).isNotEmpty();
    }
}

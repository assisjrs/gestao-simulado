package work.assisjrs.simulado.provas;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DbUnitTestExecutionListener.class })
@DatabaseSetup("/datasets/ListarProvasPorSimuladoServiceIntegrationTest.xml")
public class ListarProvasPorSimuladoServiceIntegrationTest {
    @Autowired
    private ProvaService service;

    @Test
    public void deve_listar_provas_por_simulado() {
        final List<Prova> provas = service.findBySimulado("MED-2018-FOR");

        assertThat(provas).isNotEmpty();
    }

    @Test
    public void deve_retornar_uma_listar_vazia_caso_nao_tenha_prova_para_o_simulado() {
        final List<Prova> provas = service.findBySimulado("MED-2018-SP");

        assertThat(provas).isEmpty();
    }
}

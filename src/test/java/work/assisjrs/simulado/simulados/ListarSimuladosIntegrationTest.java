package work.assisjrs.simulado.simulados;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DatabaseSetups;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DbUnitTestExecutionListener.class })
@DatabaseSetups({
        @DatabaseSetup("/datasets/clean_database.xml"),
        @DatabaseSetup("/datasets/simulados/ListarSimuladosIntegrationTest.xml")
})
public class ListarSimuladosIntegrationTest {
    @Autowired
    private SimuladoService service;

    @Test
    public void deve_listar_simulados() {
        final List<Simulado> simulados = service.all();

        assertThat(simulados).isNotEmpty();
    }

    @Test
    @DatabaseSetup("/datasets/clean_database.xml")
    public void caso_nao_existam_simulados_retornar_uma_lista_vazia() {
        final List<Simulado> simulados = service.all();

        assertThat(simulados).isEmpty();
    }

    @Test
    public void deve_retornar_o_simulado_pela_referencia_informada() {
        assertThat(service.findByReferencia("MED-2018-FOR")).isNotNull();
    }
}

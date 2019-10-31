package work.assisjrs.simulado.provas;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DatabaseSetups;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DbUnitTestExecutionListener.class })
@DatabaseSetups({
        @DatabaseSetup("/datasets/clean_database.xml"),
        @DatabaseSetup("/datasets/provas/ListarUmaProvaPorReferenciaIntegrationTest.xml")
})
public class ListarUmaProvaPorReferenciaIntegrationTest {
    @Autowired
    private ProvaService service;

    @Test
    public void deve_listar_provas_por_simulado_e_referencia() {
        final Prova prova = service.findBySimuladoAndReferencia("MED-2018-FOR", "BIOLOGIA-2018");

        assertThat(prova).isNotNull();
    }

    @Test
    public void deve_lancar_prova_nao_encontrada_caso_nao_exista_a_referencia_da_prova_naquele_simulado() {
        assertThrows(ProvaNaoEncontradaException.class, () -> {
            service.findBySimuladoAndReferencia("MED-2018-SP", "PORTUGUES-2018");
        });
    }
}

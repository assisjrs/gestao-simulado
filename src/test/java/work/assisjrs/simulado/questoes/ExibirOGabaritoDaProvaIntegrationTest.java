package work.assisjrs.simulado.questoes;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DatabaseSetups;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import work.assisjrs.simulado.provas.Prova;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DbUnitTestExecutionListener.class })
@DatabaseSetups({
        @DatabaseSetup("/datasets/clean_database.xml"),
        @DatabaseSetup(value = "/datasets/questoes/ExibirOGabaritoDaProvaIntegrationTest.xml")
})
public class ExibirOGabaritoDaProvaIntegrationTest {
    @Autowired
    private QuestaoService service;

    @Test
    public void deve_listar_questoes_da_prova() {
        final Prova prova = new Prova();
        prova.setId(1L);

        final List<Questao> questoes = service.findGabarito(prova);

        assertThat(questoes).isNotEmpty();
    }

    @Test
    public void deve_retornar_uma_listar_vazia_caso_nao_tenha_prova_para_o_simulado() {
        final Prova prova = new Prova();
        prova.setId(2L);

        final List<Questao> questoes = service.findGabarito(prova);

        assertThat(questoes).isEmpty();
    }

    @Test
    public void cada_questao_so_deve_ter_uma_escolha() {
        final Prova prova = new Prova();
        prova.setId(1L);

        final List<Questao> questoes = service.findGabarito(prova);

        assertThat(questoes.get(0).getEscolhas()).hasSize(1);
    }

    @Test
    public void deve_ter_a_escolha_com_o_flag_certo_como_true() {
        final Prova prova = new Prova();
        prova.setId(1L);

        final List<Questao> questoes = service.findGabarito(prova);

        assertThat(questoes.get(0).getEscolhas().get(0).getCerto()).isTrue();
    }
}

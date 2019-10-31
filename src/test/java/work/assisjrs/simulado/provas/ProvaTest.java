package work.assisjrs.simulado.provas;

import org.junit.jupiter.api.Test;
import work.assisjrs.simulado.simulados.Simulado;

import static org.assertj.core.api.Assertions.assertThat;

public class ProvaTest {

    @Test
    public void se_a_lista_de_simulados_for_nula_deve_retornar_uma_lista_vazia(){
        final Prova prova = new Prova();

        prova.setSimulados(null);

        assertThat(prova.getSimulados()).isEmpty();
    }

    @Test
    public void deve_poder_adicionar_um_simulado_a_prova(){
        final Prova prova = new Prova();

        prova.addSimulado(new Simulado());

        assertThat(prova.getSimulados()).isNotEmpty();
    }

    @Test
    public void deve_poder_adicionar_um_simulado_a_prova_mesmo_com_a_lista_nula(){
        final Prova prova = new Prova();

        prova.setSimulados(null);

        prova.addSimulado(new Simulado());

        assertThat(prova.getSimulados()).isNotEmpty();
    }
}

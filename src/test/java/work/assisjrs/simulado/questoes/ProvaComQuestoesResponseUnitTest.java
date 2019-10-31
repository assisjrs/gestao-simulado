package work.assisjrs.simulado.questoes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ProvaComQuestoesResponseUnitTest {
    @Test
    public void se_a_lista_de_questoes_for_nula_deve_retornar_uma_lista_vazia(){
        final ProvaComQuestoesResponse response = new ProvaComQuestoesResponse();

        response.setQuestoes(null);

        assertThat(response.getQuestoes()).isEmpty();
    }

    @Test
    public void deve_poder_adicionar_uma_questao_mesmo_com_a_lista_nula(){
        final ProvaComQuestoesResponse response = new ProvaComQuestoesResponse();

        response.setQuestoes(null);

        response.addQuestao(new QuestaoResponse());

        assertThat(response.getQuestoes()).isNotEmpty();
    }
}

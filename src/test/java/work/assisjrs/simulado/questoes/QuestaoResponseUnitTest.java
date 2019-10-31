package work.assisjrs.simulado.questoes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class QuestaoResponseUnitTest {
    @Test
    public void se_a_lista_de_escolhas_for_nula_deve_retornar_uma_lista_vazia(){
        final QuestaoResponse response = new QuestaoResponse();

        response.setEscolhas(null);

        assertThat(response.getEscolhas()).isNotNull();
    }

    @Test
    public void deve_poder_adicionar_uma_escolha_mesmo_com_a_lista_nula(){
        final QuestaoResponse response = new QuestaoResponse();

        response.setEscolhas(null);

        response.addEscolha(new EscolhaResponse());

        assertThat(response.getEscolhas()).isNotEmpty();
    }
}

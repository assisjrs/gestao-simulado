package work.assisjrs.simulado.questoes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import work.assisjrs.simulado.provas.Prova;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ExibirQuestoesPorProvaServiceUnitTest {

    @InjectMocks
    private QuestaoService service;

    @Mock
    private QuestaoRepository repository;

    @Test
    public void deve_retornar_uma_lista_vazia_de_questoes_caso_nao_tenha_questoes_para_um_determinada_prova() {
        final Prova prova = new Prova();

        prova.setId(1L);

        when(repository.findByProva(eq(prova))).thenReturn(null);

        assertThat(service.findByProva(prova)).isEmpty();
    }

    @Test
    public void deve_retornar_uma_lista_de_questoes_para_uma_determinada_prova() {
        final Prova prova = new Prova();
        prova.setId(1L);

        final List<Questao> questoes = new ArrayList<>();

        final Questao questao = new Questao();
        questao.setId(1L);

        questoes.add(questao);

        when(repository.findByProva(eq(prova))).thenReturn(questoes);

        assertThat(service.findByProva(prova)).isNotEmpty();
    }
}

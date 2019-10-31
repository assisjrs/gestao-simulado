package work.assisjrs.simulado.questoes;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ProvaComQuestoesResponse {
    private String prova;
    private String simulado;

    private List<QuestaoResponse> questoes;

    public List<QuestaoResponse> getQuestoes() {
        if(questoes == null)
            questoes = new ArrayList<>();

        return questoes;
    }

    public void addQuestao(final QuestaoResponse questao) {
        getQuestoes().add(questao);
    }
}

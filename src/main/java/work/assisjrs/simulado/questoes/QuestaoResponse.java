package work.assisjrs.simulado.questoes;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class QuestaoResponse {
    private Integer referencia;
    private String texto;

    private List<EscolhaResponse> escolhas;

    public List<EscolhaResponse> getEscolhas(){
        if(escolhas == null)
            escolhas = new ArrayList<>();

        return escolhas;
    }

    public void addEscolha(final EscolhaResponse escolha) {
        getEscolhas().add(escolha);
    }
}

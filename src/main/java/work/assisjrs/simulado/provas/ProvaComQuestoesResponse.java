package work.assisjrs.simulado.provas;

import lombok.Data;

import java.util.List;

@Data
public class ProvaComQuestoesResponse {
    private Long id;
    private String referencia;
    private String simulado;

    private List<QuestaoResponse> questoes;
}

package work.assisjrs.simulado.provas;

import lombok.Data;

import java.util.List;

@Data
public class QuestaoResponse {
    private Long id;
    private String texto;
    private Nivel nivel;

    private List<EscolhaResponse> escolhas;
}

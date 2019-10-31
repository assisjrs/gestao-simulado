package work.assisjrs.simulado.questoes;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Data
public class Escolha {
    @Id
    private Long id;

    @NotBlank
    @Column(unique = true)
    @Size(min = 1, max = 255)
    private String texto;

    private Boolean certo;

    @ManyToOne
    private Questao questao;
}

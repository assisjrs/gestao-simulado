package work.assisjrs.simulado.questoes;

import lombok.Data;
import work.assisjrs.simulado.provas.Prova;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import static javax.persistence.EnumType.STRING;

@Entity
@Data
public class Questao {
    @Id
    private Long id;

    @NotBlank
    @Column(unique = true)
    @Size(min = 1, max = 255)
    private String texto;

    @Enumerated(STRING)
    private Nivel nivel;

    @ManyToOne
    @NotNull
    private Prova prova;
}

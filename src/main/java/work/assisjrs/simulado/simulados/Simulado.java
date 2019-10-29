package work.assisjrs.simulado.simulados;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Data
public class Simulado {
    @Id
    private Long id;

    @NotBlank
    @Column(unique = true)
    @Size(min = 1, max = 255)
    private String nome;
}

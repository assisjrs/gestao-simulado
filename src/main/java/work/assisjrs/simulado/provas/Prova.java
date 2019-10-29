package work.assisjrs.simulado.provas;

import lombok.Data;
import work.assisjrs.simulado.simulados.Simulado;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Prova {
    @Id
    private Long id;

    @NotBlank
    @Column(unique = true)
    @Size(min = 1, max = 255)
    private String referencia;

    @ManyToMany
    private List<Simulado> simulados;

    public List<Simulado> getSimulados(){
        if(simulados == null)
            simulados = new ArrayList<>();

        return simulados;
    }

    public void addSimulado(final Simulado simulado) {
        getSimulados().add(simulado);
    }
}

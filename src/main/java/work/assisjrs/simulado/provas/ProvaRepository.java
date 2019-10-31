package work.assisjrs.simulado.provas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import work.assisjrs.simulado.simulados.Simulado;

import java.util.List;

@Repository
public interface ProvaRepository extends JpaRepository<Prova, Long> {
    List<Prova> findBySimulados(Simulado simulado);

    Prova findBySimuladosAndReferencia(Simulado simulado, String referencia);
}

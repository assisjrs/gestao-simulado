package work.assisjrs.simulado.simulados;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SimuladoRepository extends JpaRepository<Simulado, Long> {
}

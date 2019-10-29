package work.assisjrs.simulado.simulados;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ListarSimuladosServiceUnitTest {

    @InjectMocks
    private SimuladoService service;

    @Mock
    private SimuladoRepository repository;

    @Test
    public void deve_retornar_uma_lista_vazia_caso_nao_tenha_simulados() {
        when(repository.findAll()).thenReturn(null);

        assertThat(service.all()).isEmpty();
    }

    @Test
    public void deve_retornar_uma_lista_nao_vazia_caso_nao_tenha_simulados() {
        final List<Simulado> simulados = new ArrayList<>();

        simulados.add(new Simulado());

        when(repository.findAll()).thenReturn(simulados);

        assertThat(service.all()).isNotEmpty();
    }
}

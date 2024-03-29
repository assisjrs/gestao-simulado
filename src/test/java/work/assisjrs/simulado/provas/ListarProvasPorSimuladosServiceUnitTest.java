package work.assisjrs.simulado.provas;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import work.assisjrs.simulado.simulados.Simulado;
import work.assisjrs.simulado.simulados.SimuladoService;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ListarProvasPorSimuladosServiceUnitTest {

    @InjectMocks
    private ProvaService service;

    @Mock
    private SimuladoService simuladoService;

    @Mock
    private ProvaRepository repository;

    @Test
    public void deve_retornar_uma_lista_vazia_caso_nao_tenha_provas_para_um_determinado_simulado() {
        final Simulado simulado = new Simulado();
        simulado.setId(1L);

        when(simuladoService.findByReferencia(eq("FAR-2019-FOR"))).thenReturn(simulado);
        when(repository.findBySimulados(eq(simulado))).thenReturn(null);

        assertThat(service.findBySimulado("FAR-2019-FOR")).isEmpty();
    }

    @Test
    public void deve_retornar_as_provas_por_simulado() {
        final Simulado simulado = new Simulado();
        simulado.setId(1L);

        when(simuladoService.findByReferencia(eq("MED-2019-FOR"))).thenReturn(simulado);

        final List<Prova> provas = new ArrayList<>();
        final Prova prova = new Prova();
        prova.addSimulado(simulado);
        provas.add(prova);

        when(repository.findBySimulados(eq(simulado))).thenReturn(provas);

        assertThat(service.findBySimulado("MED-2019-FOR")).isNotEmpty();
    }

    @Test
    public void deve_retornar_uma_prova_por_simulado_e_referencia() {
        final Simulado simulado = new Simulado();
        simulado.setId(1L);

        when(simuladoService.findByReferencia(eq("MED-2019-FOR"))).thenReturn(simulado);

        final Prova prova = new Prova();
        prova.setId(1L);
        prova.addSimulado(simulado);

        when(repository.findBySimuladosAndReferencia(eq(simulado), eq("BIOLOGIA-2019"))).thenReturn(prova);

        assertThat(service.findBySimuladoAndReferencia("MED-2019-FOR", "BIOLOGIA-2019")).isNotNull();
    }

    @Test
    public void caso_nao_exista_a_prova_naquele_simulado_lancar_prova_nao_encontrada_exception() {
        final Simulado simulado = new Simulado();
        simulado.setId(1L);

        when(simuladoService.findByReferencia(eq("MED-2019-FOR"))).thenReturn(simulado);
        when(repository.findBySimuladosAndReferencia(eq(simulado), eq("BIOLOGIA-2019"))).thenReturn(null);

        assertThrows(ProvaNaoEncontradaException.class, () -> {
            service.findBySimuladoAndReferencia("MED-2019-FOR", "BIOLOGIA-2019");
        });
    }
}

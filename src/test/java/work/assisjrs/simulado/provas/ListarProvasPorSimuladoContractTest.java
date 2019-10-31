package work.assisjrs.simulado.provas;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DatabaseSetups;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import static com.jayway.restassured.RestAssured.get;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasKey;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;
import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.http.HttpStatus.OK;
import static work.assisjrs.simulado.Helper.url;

@SpringBootTest(webEnvironment = RANDOM_PORT)
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DbUnitTestExecutionListener.class })
@DatabaseSetups({
        @DatabaseSetup("/datasets/clean_database.xml"),
        @DatabaseSetup("/datasets/provas/ListarProvasPorSimuladoContractTest.xml")
})
public class ListarProvasPorSimuladoContractTest {
    @Value("${local.server.port}")
    private int port = 0;

    @Test
    public void deve_retornar_200_ao_quando_houver_simulados() {
        get(url(port,"/simulados/MED-2018-FOR/provas/"))
                .then()
                .statusCode(OK.value());
    }

    @Test
    public void deve_retornar_404_ao_quando_houver_simulados() {
        get(url(port,"/simulados/FAR-2019-SP/provas/"))
                .then()
                .statusCode(NOT_FOUND.value());
    }

    @Test
    public void deve_existir_o_campo_referencia() {
        get(url(port,"/simulados/MED-2018-FOR/provas/"))
                .then()
                .body("[0]", hasKey("referencia"));
    }

    @Test
    public void deve_existir_o_campo_simulado() {
        get(url(port,"/simulados/MED-2018-FOR/provas/"))
                .then()
                .body("[0]", hasKey("simulado"));
    }

    @Test
    public void o_campo_simulado_deve_trazer_a_referencia_do_simulado() {
        get(url(port,"/simulados/MED-2018-FOR/provas/"))
                .then()
                .body("[0].simulado", equalTo("MED-2018-FOR"));
    }
}

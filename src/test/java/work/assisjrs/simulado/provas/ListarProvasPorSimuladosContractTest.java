package work.assisjrs.simulado.provas;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static com.jayway.restassured.RestAssured.get;
import static org.hamcrest.Matchers.hasKey;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;
import static org.springframework.http.HttpStatus.OK;
import static work.assisjrs.simulado.Helper.url;

@SpringBootTest(webEnvironment = RANDOM_PORT)
public class ListarProvasPorSimuladosContractTest {
    @Value("${local.server.port}")
    private int port = 0;

    @Test
    public void deve_retornar_200_ao_quando_houver_simulados() {
        get(url(port,"/simulados/MED-2019-SP/provas/"))
                .then()
                .statusCode(OK.value());
    }

    @Test
    public void deve_existir_o_campo_id() {
        get(url(port,"/simulados/MED-2019-SP/provas/"))
                .then()
                .body("[0]", hasKey("id"));
    }

    @Test
    public void deve_existir_o_campo_referencia() {
        get(url(port,"/simulados/MED-2019-SP/provas/"))
                .then()
                .body("[0]", hasKey("referencia"));
    }

    @Test
    public void deve_existir_o_campo_simulado() {
        get(url(port,"/simulados/MED-2019-SP/provas/"))
                .then()
                .body("[0]", hasKey("simulado"));
    }
}

package work.assisjrs.simulado.simulados;

import com.jayway.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.jayway.restassured.RestAssured.get;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasKey;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;
import static org.springframework.http.HttpStatus.OK;
import static work.assisjrs.simulado.Helper.url;

@SpringBootTest(webEnvironment = RANDOM_PORT)
public class ListarSimuladosContractTest {
    @Value("${local.server.port}")
    private int port = 0;

    @Test
    public void deve_retornar_200_ao_quando_houver_simulados() {
        RestAssured.get(url(port,"/simulados"))
                .then()
                .statusCode(OK.value());
    }

    @Test
    public void deve_listar_simulados() {
        final List<SimuladoResponse> itens = get(url(port,"/simulados"))
                .thenReturn().jsonPath().get();

        assertThat(itens).isNotEmpty();
    }

    @Test
    public void deve_existir_o_campo_id() {
        get(url(port,"/simulados"))
       .then()
       .body("[0]", hasKey("id"));
    }

    @Test
    public void deve_existir_o_campo_nome() {
        get(url(port,"/simulados"))
                .then()
                .body("[0]", hasKey("nome"));
    }
}

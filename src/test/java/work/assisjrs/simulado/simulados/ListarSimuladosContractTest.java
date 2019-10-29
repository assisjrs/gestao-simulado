package work.assisjrs.simulado.simulados;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.jayway.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import java.util.List;

import static com.jayway.restassured.RestAssured.get;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasKey;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;
import static org.springframework.http.HttpStatus.NO_CONTENT;
import static org.springframework.http.HttpStatus.OK;
import static work.assisjrs.simulado.Helper.url;

@SpringBootTest(webEnvironment = RANDOM_PORT)
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DbUnitTestExecutionListener.class })
@DatabaseSetup("/datasets/ListarSimuladosContractTest.xml")
public class ListarSimuladosContractTest {
    @Value("${local.server.port}")
    private int port = 0;

    @Test
    public void deve_retornar_200_ao_quando_houver_simulados() {
        get(url(port,"/simulados"))
                .then()
                .statusCode(OK.value());
    }

    @Test
    @DatabaseSetup("/datasets/clean_database.xml")
    public void deve_retornar_204_ao_quando_nao_houver_simulados() {
        get(url(port,"/simulados"))
                .then()
                .statusCode(NO_CONTENT.value());
    }

    @Test
    public void deve_existir_o_campo_id() {
        get(url(port,"/simulados"))
       .then()
       .body("[0]", hasKey("id"));
    }

    @Test
    public void deve_existir_o_campo_referencia() {
        get(url(port,"/simulados"))
                .then()
                .body("[0]", hasKey("referencia"));
    }
}

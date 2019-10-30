package work.assisjrs.simulado.questoes;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DatabaseSetups;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import static com.jayway.restassured.RestAssured.get;
import static org.hamcrest.Matchers.hasKey;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;
import static org.springframework.http.HttpStatus.OK;
import static work.assisjrs.simulado.Helper.url;

@SpringBootTest(webEnvironment = RANDOM_PORT)
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DbUnitTestExecutionListener.class })
@DatabaseSetups({
        @DatabaseSetup("/datasets/clean_database.xml"),
        @DatabaseSetup("/datasets/questoes/ExibirAProvaParaSerRespondidaContractTest.xml")
})
public class ExibirAProvaParaSerRespondidaContractTest {
    @Value("${local.server.port}")
    private int port = 0;

    @Test
    public void deve_retornar_200_ao_quando_houver_simulados() {
        get(url(port,"/simulados/MED-2018-FOR/provas/BIOLOGIA-2018"))
                .then()
                .statusCode(OK.value());
    }

    @Test
    public void deve_existir_o_campo_id() {
        get(url(port,"/simulados/MED-2018-FOR/provas/BIOLOGIA-2018"))
                .then()
                .body("[0]", hasKey("id"));
    }

    @Test
    public void deve_existir_o_campo_referencia() {
        get(url(port,"/simulados/MED-2018-FOR/provas/BIOLOGIA-2018"))
                .then()
                .body("[0]", hasKey("referencia"));
    }

    @Test
    public void deve_existir_o_campo_simulado() {
        get(url(port,"/simulados/MED-2018-FOR/provas/BIOLOGIA-2018"))
                .then()
                .body("[0]", hasKey("simulado"));
    }

    @Test
    public void deve_existir_a_lista_de_questoes() {
        get(url(port,"/simulados/MED-2018-FOR/provas/BIOLOGIA-2018"))
                .then()
                .body("[0]", hasKey("questoes"));
    }

    @Test
    public void para_as_questoes_deve_existir_o_id() {
        get(url(port,"/simulados/MED-2018-FOR/provas/BIOLOGIA-2018"))
                .then()
                .body("[0].questoes[0]", hasKey("id"));
    }

    @Test
    public void para_as_questoes_deve_existir_o_nivel() {
        get(url(port,"/simulados/MED-2018-FOR/provas/BIOLOGIA-2018"))
                .then()
                .body("[0].questoes[0]", hasKey("nivel"));
    }

    @Test
    public void para_as_questoes_deve_existir_a_texto() {
        get(url(port,"/simulados/MED-2018-FOR/provas/BIOLOGIA-2018"))
                .then()
                .body("[0].questoes[0]", hasKey("texto"));
    }

    @Test
    public void para_a_lista_de_escolhas() {
        get(url(port,"/simulados/MED-2018-FOR/provas/BIOLOGIA-2018"))
                .then()
                .body("[0].questoes[0]", hasKey("escolhas"));
    }

    @Test
    public void para_a_a_escolha_deve_existir_id() {
        get(url(port,"/simulados/MED-2018-FOR/provas/BIOLOGIA-2018"))
                .then()
                .body("[0].questoes[0].escolhas[0]", hasKey("id"));
    }

    @Test
    public void para_a_a_escolha_deve_existir_texto() {
        get(url(port,"/simulados/MED-2018-FOR/provas/BIOLOGIA-2018"))
                .then()
                .body("[0].questoes[0].escolhas[0]", hasKey("texto"));
    }
}

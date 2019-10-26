package work.assisjrs.simulado.simulados;

import com.jayway.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

import static com.jayway.restassured.RestAssured.get;
import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;
import static work.assisjrs.simulado.Helper.url;

@SpringBootTest(webEnvironment = RANDOM_PORT)
public class ListarSimuladosContractTest {
    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Value("${local.server.port}")
    private int port = 0;

    @BeforeEach
    public void before() {
        mockMvc = webAppContextSetup(wac).build();
    }

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
}

package work.assisjrs.simulado;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;
import static org.springframework.http.HttpStatus.OK;
import static com.jayway.restassured.RestAssured.get;
import static work.assisjrs.simulado.Helper.url;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class SimuladoApiApplicationTests {
	@Value("${local.server.port}")
	private int port = 0;

	@Test
	public void deve_subir_endpoint_healtcheck() {
		get(url(port,"/actuator/health"))
				.then()
				.statusCode(OK.value());
	}
}

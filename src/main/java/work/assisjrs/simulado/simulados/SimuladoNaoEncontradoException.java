package work.assisjrs.simulado.simulados;

import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@ResponseStatus(NOT_FOUND)
public class SimuladoNaoEncontradoException extends RuntimeException {

    public SimuladoNaoEncontradoException(final String mensagem) {
        super(mensagem);
    }
}

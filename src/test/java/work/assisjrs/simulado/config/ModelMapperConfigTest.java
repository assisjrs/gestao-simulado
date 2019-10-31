package work.assisjrs.simulado.config;

import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ContextConfiguration(classes={ModelMapperConfig.class})
public class ModelMapperConfigTest {
    @Autowired
    private ModelMapper modelMapper;

    @Test
    public void deveCarregarOMapeamento(){
        assertThat(modelMapper).isNotNull();
    }
}

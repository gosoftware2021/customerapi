package in.gosoftware.teleassistliveapi;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "TeleAssist", version = "2.0", description = "TeleAssist API Information"))

public class TeleAssistapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeleAssistapiApplication.class, args);









	}

	@Bean
	public ModelMapper modelMapper()
	{
		return new ModelMapper();
	}

}

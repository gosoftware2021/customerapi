package in.gosoftware.teleassistliveapi;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "TeleAssist", version = "2.0", description = "TeleAssist API Information"))

public class TeleAssistapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeleAssistapiApplication.class, args);









	}



}

package co.alpha.UserModule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication
@EnableJpaRepositories("co.alpha")  // Ensure correct package path
@EntityScan("co.alpha")             // Scan entity package
@ComponentScan("co.alpha") 


public class UserModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserModuleApplication.class, args);
	}

}

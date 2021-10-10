package del.ac.id.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("del.*")
public class Berita16Application {

	public static void main(String[] args) {
		SpringApplication.run(Berita16Application.class, args);
	}

}

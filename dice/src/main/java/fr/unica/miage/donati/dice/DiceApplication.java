package fr.unica.miage.donati.dice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DiceApplication {

	@RequestMapping("/")
	public String home() {
		return "Hello Miage groupe TD1";
	}

	public static void main(String[] args) {
		SpringApplication.run(DiceApplication.class, args);
	}

}

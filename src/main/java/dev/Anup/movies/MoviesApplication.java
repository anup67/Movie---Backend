package dev.Anup.movies;

import org.springframework.boot.SpringApplication; // this particular class contains a method called run
import org.springframework.boot.autoconfigure.SpringBootApplication; // annotation in java usually is to let know  the compiler about what this class does
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

	@GetMapping("/root")
	public String apiRoot(){
		return "Hello World!";
	}

}

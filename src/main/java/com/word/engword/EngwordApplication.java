package com.word.engword;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EngwordApplication {

	public static void main(String[] args) {
		SpringApplication.run(EngwordApplication.class, args);
	}

}

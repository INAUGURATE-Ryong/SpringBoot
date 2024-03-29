package com.test.configclient2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClient2Application.class, args);
	}

	@Value("${name}")
	private String name;

	@GetMapping("/name")
	public String getName() {
		return name;
	}

	//url : http://localhost:9092/actuator
// POST, http://localhost:9092/actuator/refresh


}


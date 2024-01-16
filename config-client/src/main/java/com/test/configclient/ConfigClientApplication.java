package com.test.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

	@Value("${name}")
	private String name;

	@Value("${email}")
	private String email;

	@GetMapping("/name")   // GET, http://localhost:9091/name
	public String getName() {
		return name;
	}

	@GetMapping("/email")   // GET, http://localhost:9091/email
	public String getEmail() {
		return email;
	}

	//교재 179~
	//교재 165~ 참고

}

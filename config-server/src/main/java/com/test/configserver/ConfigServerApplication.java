package com.test.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}

// http://localhost:8888/myclient/test  이렇게 들어가면  yml에 있는 깃 주소에 yml 파일을 열어볼수 있다.
// yml로 열었으면 yml만 볼수 있고 properties로 열면 properties만 조회할 수 있음.

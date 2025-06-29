package com.lukacode.microservices.limits_microservices_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class LimitsMicroservicesConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LimitsMicroservicesConfigServerApplication.class, args);
	}

}

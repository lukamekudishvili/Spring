package com.lukacode.Products_Microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
public class ProductsMicroserviceApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProductsMicroserviceApplication.class, args);


	}

}

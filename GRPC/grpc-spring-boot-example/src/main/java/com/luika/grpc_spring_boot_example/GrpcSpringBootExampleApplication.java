package com.luika.grpc_spring_boot_example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.luka.model.PersonOuterClass;

@SpringBootApplication
public class GrpcSpringBootExampleApplication {

	public static void main(String[] args) {


		SpringApplication.run(GrpcSpringBootExampleApplication.class, args);
		CommandLineRunner runner=(s->{
			System.out.println("Hello World");
		});
	}

}

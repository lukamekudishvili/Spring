package com.lukacode.database.database_demo;

import com.lukacode.database.database_demo.jdbc.PersonJdbcDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {

	@Autowired
	PersonJdbcDAO dao;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(dao.findAll());
		System.out.println("-".repeat(30));
		System.out.println(dao.findById(4));
	}
}

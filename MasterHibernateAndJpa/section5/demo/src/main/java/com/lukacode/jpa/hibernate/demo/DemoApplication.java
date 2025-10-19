package com.lukacode.jpa.hibernate.demo;

import com.lukacode.jpa.hibernate.demo.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
@Slf4j
public class DemoApplication implements CommandLineRunner {

	private final CourseRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var course=repository.findById(1001L ).orElseThrow(()->new RuntimeException("No course found"));
		log.info("Course with id 1001: {}",course.toString());
		repository.deleteById(1001L);
	}
}

package com.example.hibernate_01;

import com.example.hibernate_01.repository.CourseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Hibernate01Application implements CommandLineRunner {

    @Autowired
    private CourseRepository courseRepository;

	public static void main(String[] args) {
		SpringApplication.run(Hibernate01Application.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        var t=courseRepository.findById(10001L);
        log.info("result: {}", t.get().toString());
    }
}

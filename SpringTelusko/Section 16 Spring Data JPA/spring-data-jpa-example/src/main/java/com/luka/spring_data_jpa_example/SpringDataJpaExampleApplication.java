package com.luka.spring_data_jpa_example;

import com.luka.spring_data_jpa_example.Repository.StudentRepository;
import com.luka.spring_data_jpa_example.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaExampleApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(SpringDataJpaExampleApplication.class, args);

		StudentRepository studentRepository=context.getBean(StudentRepository.class);




		Student student1=context.getBean(Student.class);
		Student student2=context.getBean(Student.class);
		Student student3=context.getBean(Student.class);

		student1.setId(101);
		student1.setFirstName("John");
		student1.setLastName("Smith");
		student1.setEmail("John@gmail.com");

		student2.setId(102);
		student2.setFirstName("Jane");
		student2.setLastName("Smith");
		student2.setEmail("Jane@Gmail.com");

		student3.setId(103);
		student3.setFirstName("Bob");
		student3.setLastName("Smith");
		student3.setEmail("Bob@Gmail.com");

		studentRepository.save(student3);

//		System.out.println(studentRepository.findAll());

		System.out.println(studentRepository.findByLastName("Smith2"));
	}

}

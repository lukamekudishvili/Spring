package com.luka.springJDBC;

import com.luka.springJDBC.model.Student;
import com.luka.springJDBC.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringJdbcApplication.class, args);

		Student student= ctx.getBean(Student.class);
		student.setRollNo(101);
		student.setName("Luka");
		student.setMarks(80);

		StudentService service=ctx.getBean(StudentService.class);
		service.addStudent(student);

	}

}

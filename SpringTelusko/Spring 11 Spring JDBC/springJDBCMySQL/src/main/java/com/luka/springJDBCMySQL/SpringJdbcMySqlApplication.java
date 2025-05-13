package com.luka.springJDBCMySQL;

import com.luka.springJDBCMySQL.model.Student;
import com.luka.springJDBCMySQL.repository.StudentRepository;
import com.luka.springJDBCMySQL.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcMySqlApplication {

	public static void main(String[] args) {

		ApplicationContext ctx =SpringApplication.run(SpringJdbcMySqlApplication.class, args);
		StudentService service =ctx.getBean(StudentService.class);
		service.deleteStudent(101);


		Student student=ctx.getBean(Student.class);
		student.setId(101);
		student.setFirstName("Test");
		student.setLastName("Testishvili");
		student.setEmail("Test@Test.com");


		service.addStudent(student);

		for(Student s : service.getAllStudents()){
			System.out.println(s);
		}

		System.out.println();

	}

}

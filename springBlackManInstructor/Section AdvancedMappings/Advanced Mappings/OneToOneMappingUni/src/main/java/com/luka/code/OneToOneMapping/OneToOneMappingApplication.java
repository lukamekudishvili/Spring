package com.luka.code.OneToOneMapping;

import com.luka.code.OneToOneMapping.dao.AppDAO;
import com.luka.code.OneToOneMapping.entity.Instructor;
import com.luka.code.OneToOneMapping.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OneToOneMappingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneToOneMappingApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDAO appDAO){
		return runner -> {
			//createInstructor(appDAO);
////			findInstructor(appDAO);
//			deleteInstructor(appDAO);
			System.out.println("Hello");
		};
	}

	private void createInstructor(AppDAO appDAO){
		Instructor instructor= new Instructor("Test", "Test", "Test@gmail.com");
		InstructorDetail instructorDetail=new InstructorDetail("youtube link Test","reading-test");

		instructor.setInstructorDetail(instructorDetail);

		System.out.println("Saving instructor: "+instructor);
		appDAO.save(instructor);
	}

	private void findInstructor(AppDAO appDAO){
		int id=2;
		System.out.println("Finding instructor id: "+id);
		Instructor instructor=appDAO.findInstructorById(id);
		if(instructor==null){
			System.out.println("Not found instructor with id: "+id);
			return;
		}
		System.out.println(instructor);
		System.out.println(instructor.getInstructorDetail());
	}

	private void deleteInstructor(AppDAO appDAO){
		int id=2;
		appDAO.deleteInstructorById(id);
	}

}

package com.luka.code.OneToOneMapping;

import com.luka.code.OneToOneMapping.dao.AppDAO;
import com.luka.code.OneToOneMapping.entity.Course;
import com.luka.code.OneToOneMapping.entity.Instructor;
import com.luka.code.OneToOneMapping.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class OneToOneMappingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneToOneMappingApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDAO appDAO){
		return runner -> {
//			createInstructor(appDAO);
////			findInstructor(appDAO);
//			deleteInstructor(appDAO);
//			System.out.println("Hello");
//			findInstructorDetail(appDAO);
//			deleteInstructorDetail(appDAO);
			createInstructorWithCourses(appDAO);
		};
	}

	private void createInstructorWithCourses(AppDAO appDAO) {
		Instructor instructor= new Instructor("Susan", "Public", "susan.public@gmail.com");
		InstructorDetail instructorDetail=new InstructorDetail("youtube link Susan","reading-Susan");

		instructor.setInstructorDetail(instructorDetail);

		Course course1=new Course("Air Guitrar - The ultimate guide");
		Course course2=new Course("Football");

		instructor.add(course1);
		instructor.add(course2);
		System.out.println("Saving instructor: "+instructor);
		System.out.println("Saving courses: "+instructor.getCourses());
		appDAO.save(instructor);
		System.out.println("Done");

	}

	private void createInstructor(AppDAO appDAO){
		Instructor instructor= new Instructor("Luka", "Mekudishvili", "MekudishviliLuka@gmail.com");
		InstructorDetail instructorDetail=new InstructorDetail("youtube link Luka","reading-Luka");

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

	private void findInstructorDetail(AppDAO appDAO){
		int id=1;
		InstructorDetail instructorDetail=appDAO.findInstructorDetailByID(id);
		Instructor instructor=instructorDetail.getInstructor();
		System.out.println("Instructor detail: "+instructorDetail);
		System.out.println("Instructor: "+instructor);
	}

	private void deleteInstructorDetail(AppDAO appDAO){
		int id=3;
		appDAO.deleteInstructorDetailById(id);
		System.out.println("Deleted Successfully!");
	}

}

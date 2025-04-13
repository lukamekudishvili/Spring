package com.luka.code.cruddemo;

import com.luka.code.cruddemo.entity.Student;
import com.luka.code.cruddemo.repository.StudentDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@SpringBootApplication
public class CruddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CruddemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDao studentDao) {
        return runner -> {
//            createStudent(studentDao);
//            createMultipleStudents(studentDao);
//            readStudent(studentDao);
            findAllStudents(studentDao);
            findStudentByLastName(studentDao);
            findStudentLikeEmail(studentDao);
        };
    }

    public void createStudent(StudentDao studentDao) {
        Student student = new Student("Luka", "Mekudishvili", "lmekudishvili@bog.ge");

        studentDao.save(student);

        System.out.println("saved student id: " + student.getId());
    }

    public void createMultipleStudents(StudentDao studentDao) {
        List<Student> students = List.of(
                new Student("Luka", "Kurkhuli", "lkurkhuli@bog.ge"),
                new Student("Levan", "Tokhvadze", "ltokhvadze@bog.ge"),
                new Student("Tina", "Tokhvadze", "totkhvadze@bog.ge"),
                new Student("Giga", "Urduladze", "gurduladze@bog.ge"),
                new Student("Gio", "Tateosiani", "gtateosiani@bog.ge")
        );
        ListIterator<Student> studentIterator = students.listIterator();
        while (studentIterator.hasNext()) {
            studentDao.save(studentIterator.next());
            System.out.println("Saved Student id: " + studentIterator.previous());
            studentIterator.next();
        }

    }

    public void readStudent(StudentDao studentDao){
        Student student=studentDao.findById(11);
        System.out.println(student);
    }

    public void findAllStudents(StudentDao studentDao){
        List<Student> students=studentDao.findAll();
        System.out.println("All students:");
        for(Student s: students){
            System.out.println(s);
        }
    }
    public void findStudentByLastName(StudentDao studentDao){
        List<Student> students=studentDao.findByLastName("Tokhvadze");
        System.out.println("All students who has lastname - 'Tokhvadze' :");
        for(Student s: students){
            System.out.println(s);
        }
    }

    public void findStudentLikeEmail(StudentDao studentDao){
        List<Student> students=studentDao.findByEmail("@bog.ge");
        System.out.println("All students who has email like - '@bog.ge' :");
        for(Student s: students){
            System.out.println(s);
        }
    }

    public void updateStudent(StudentDao studentDao){
        studentDao.updateAll();
    }


}

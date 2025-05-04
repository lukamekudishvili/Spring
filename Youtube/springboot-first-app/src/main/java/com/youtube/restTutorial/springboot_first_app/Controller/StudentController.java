package com.youtube.restTutorial.springboot_first_app.Controller;

import com.youtube.restTutorial.springboot_first_app.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

public class StudentController {

    @GetMapping("/getStudent")
    public Student getStudent() {
        return new Student("Luka", "Mekudishvili");
    }

    @GetMapping("/getStudents")
    public List<Student> getStudents() {
        return new ArrayList<>(List.of(
                new Student("Luka", "Mekudishvili"),
                new Student("Luka1", "Mekudishvili1"),
                new Student("Luka2", "Mekudishvili2"),
                new Student("Luka3", "Mekudishvili3")
        ));
    }

    @GetMapping("/getStudent/{fName}/{lName}")
    public Student studentByName(@PathVariable("fName") String firstName, @PathVariable("lName") String lastName) {

        System.out.println("sName: "+firstName);
        System.out.println("lName: "+lastName);
        List<Student> students = new ArrayList<>(List.of(
                new Student("Luka", "Mekudishvili"),
                new Student("Luka1", "Mekudishvili1"),
                new Student("Luka2", "Mekudishvili2"),
                new Student("Luka3", "Mekudishvili3")));

        for (Student s : students) {
            if (s.getFirstName().equalsIgnoreCase(firstName) && s.getLastName().equalsIgnoreCase(lastName)) {
                return s;
            }
        }
        return null;
    }

    @GetMapping("/getStudentByParam")
    public Student studentByParam(@RequestParam String firstName, @RequestParam String lastName){
        List<Student> students = new ArrayList<>(List.of(
                new Student("Luka", "Mekudishvili"),
                new Student("Luka1", "Mekudishvili1"),
                new Student("Luka2", "Mekudishvili2"),
                new Student("Luka3", "Mekudishvili3")));

        for (Student s : students) {
            if (s.getFirstName().equalsIgnoreCase(firstName) && s.getLastName().equalsIgnoreCase(lastName)) {
                return s;
            }
        }
        return null;
    }
}

package com.lukacode.masterJpaHibernate.example1.controller;

import com.lukacode.masterJpaHibernate.example1.model.Course;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @GetMapping
    public ResponseEntity<List<Course>> retrieveAllCourses(){
        var courses=Arrays.asList(
                new Course("1","course1", "autho1"),
                new Course("2","course2", "autho2"),
                new Course("3","course3", "autho3")
                );

        return ResponseEntity.ok(courses);
    }
}

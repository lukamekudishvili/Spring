package com.luka.springJDBC.service;

import com.luka.springJDBC.model.Student;

import java.util.List;

public interface StudentService {
    Student addStudent(Student student);
    List<Student> getStudents();
}

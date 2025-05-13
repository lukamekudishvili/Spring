package com.luka.springJDBCMySQL.service;

import com.luka.springJDBCMySQL.model.Student;

import java.util.List;

public interface StudentService {
    int addStudent(Student student);
    List<Student> getAllStudents();
    int deleteStudent(int id);
}

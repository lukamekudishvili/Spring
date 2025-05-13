package com.luka.springJDBCMySQL.repository;

import com.luka.springJDBCMySQL.model.Student;

import java.util.List;

public interface StudentRepository {
    int save(Student student);

    List<Student> findAll();

    int deleteById(int id);
}

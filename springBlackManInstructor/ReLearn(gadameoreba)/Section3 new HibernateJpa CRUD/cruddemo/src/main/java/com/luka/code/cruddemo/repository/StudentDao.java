package com.luka.code.cruddemo.repository;
import com.luka.code.cruddemo.entity.Student;

import java.util.List;

public interface StudentDao {
    void save(Student student);
    Student findById(Integer id);
    List<Student> findAll();
    List<Student> findByLastName(String lastName);
    List<Student> findByEmail(String email);
    void updateAll();
}

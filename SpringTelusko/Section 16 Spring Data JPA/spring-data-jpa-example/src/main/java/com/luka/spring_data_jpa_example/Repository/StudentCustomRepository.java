package com.luka.spring_data_jpa_example.Repository;

import com.luka.spring_data_jpa_example.model.Student;

import java.util.List;

public interface StudentCustomRepository {
    List<Student> findByLastName(String lastName);
}

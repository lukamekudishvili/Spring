package com.luka.spring_data_jpa_example.Repository;

import com.luka.spring_data_jpa_example.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>, StudentCustomRepository  {
}

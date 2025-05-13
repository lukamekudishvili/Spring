package com.luka.springJDBC.repository;

import com.luka.springJDBC.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public StudentRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int save(Student student){
        String sql="insert into student (rollNo, name, marks) values(?,?,?)";
        int rows=jdbcTemplate.update(sql,student.getRollNo(),student.getName(), student.getMarks());
        System.out.println(rows);
        return rows;
    }

    public List<Student> listStudents(){
        return new ArrayList<>();
    }
}

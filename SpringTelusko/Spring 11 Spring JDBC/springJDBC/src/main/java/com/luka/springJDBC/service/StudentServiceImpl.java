package com.luka.springJDBC.service;

import com.luka.springJDBC.model.Student;
import com.luka.springJDBC.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student addStudent(Student student) {
        System.out.println("Student Added!");
        studentRepository.save(student);
        return null;
    }

    @Override
    public List<Student> getStudents() {
        return studentRepository.listStudents();
    }
}

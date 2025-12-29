package com.example.hibernate_01.repository;

import com.example.hibernate_01.domain.Course;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class CourseRepository {
    private final EntityManager entityManager;

    public Optional<Course> findById(Long id){
        return Optional.of(entityManager.find(Course.class, id));
    }
}

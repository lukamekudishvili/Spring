package com.lukacode.jpa.hibernate.demo.repository;

import com.lukacode.jpa.hibernate.demo.domain.Course;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

@SpringBootTest
@RequiredArgsConstructor
class CourseRepositoryTest {
    @Autowired
    CourseRepository courseRepository;

//    @Test
//    public void findByIdTest_Exception(){
//        Assertions.assertThrows(RuntimeException.class, () -> {
//            courseRepository.findById(1003L).get();
//        });
//    }

    @Test
    public void findByIdTest(){
        Assertions.assertNotNull(courseRepository.findById(1002L).get());
    }

    @Test
    @DirtiesContext
    public void deleteByIdTest(){
        courseRepository.deleteById(1002L);
        Assertions.assertNull(courseRepository.findById(1002L).get());
    }

}
package com.lukacode.jpa.hibernate.demo.repository;

import com.lukacode.jpa.hibernate.demo.domain.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
@Slf4j
public class CourseRepository {

    private final EntityManager entityManager;

    public Optional<Course> findById(Long id){
        TypedQuery<Course> typedQuery =
                entityManager.createQuery("select c from Course c where c.id=:id", Course.class);
        typedQuery.setParameter("id",id);

        try{
            return Optional.of(typedQuery.getSingleResult());
        }catch (NoResultException ex){
            log.info("No course found with id: {}",id);
            return Optional.empty();
        }
    }

    @Transactional
    public void deleteById(Long id){
        Course course = findById(id).get();
        entityManager.remove(course);

    }


}

package com.luka.spring_data_jpa_example.Repository;

import com.luka.spring_data_jpa_example.model.Student;
import jakarta.persistence.Access;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentCustomRepositoryImpl implements StudentCustomRepository {

    private final EntityManager entityManager;

    @Autowired
    public StudentCustomRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Student> findByLastName(String lastName) {
        TypedQuery<Student> query=entityManager.createQuery("select s from Student s where s.lastName = :lastName", Student.class);
        query.setParameter("lastName",lastName);
        return query.getResultList();
    }
}

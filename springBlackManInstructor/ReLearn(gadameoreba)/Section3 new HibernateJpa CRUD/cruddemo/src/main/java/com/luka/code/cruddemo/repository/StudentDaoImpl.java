package com.luka.code.cruddemo.repository;

import com.luka.code.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {
    private final EntityManager entityManager;

    @Autowired
    public StudentDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> query = entityManager.createQuery("FROM Student WHERE 1=1", Student.class);
        return query.getResultList();
    }

    @Override
    public List<Student> findByLastName(String lastName) {
        TypedQuery<Student> query = entityManager.createQuery("FROM Student WHERE lastName=:lastName", Student.class);
        query.setParameter("lastName", lastName);
        return query.getResultList();
    }

    @Override
    public List<Student> findByEmail(String email) {
        TypedQuery<Student> query = entityManager.createQuery("SELECT s FROM Student s WHERE email LIKE :email",
                Student.class);
        query.setParameter("email", "%"+email);
        return query.getResultList();
    }

    @Override
    public void updateAll() {
        int rowsUpdated=entityManager.createQuery("UPDATE Student set lastName='Mekudishvili'").executeUpdate();
        System.out.println("Updated "+rowsUpdated+" record!");
    }

}

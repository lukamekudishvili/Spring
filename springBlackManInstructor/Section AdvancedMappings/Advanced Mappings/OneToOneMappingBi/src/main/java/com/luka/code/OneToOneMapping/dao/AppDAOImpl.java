package com.luka.code.OneToOneMapping.dao;

import com.luka.code.OneToOneMapping.entity.Instructor;
import com.luka.code.OneToOneMapping.entity.InstructorDetail;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class AppDAOImpl implements AppDAO {
    private final EntityManager entityManager;

    @Autowired
    public AppDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Instructor instructor) {
        entityManager.persist(instructor);
    }

    @Override
    public Instructor findInstructorById(int id) {
        return entityManager.find(Instructor.class,id);
    }

    @Override
    @Transactional
    public void deleteInstructorById(int id) {
        Instructor instructor=findInstructorById(id);
        if(instructor!=null){
            entityManager.remove(instructor);
            System.out.println("Deleted successfully!");
            return;
        }
        System.out.println("Not found Instructor with id: "+id);
    }

    @Override
    public InstructorDetail findInstructorDetailByID(int id) {
        return entityManager.find(InstructorDetail.class,id);
    }

    @Override
    @Transactional
    public void deleteInstructorDetailById(int id) {
        InstructorDetail instructorDetail=findInstructorDetailByID(id);
        instructorDetail.getInstructor().setInstructorDetail(null);
        entityManager.remove(instructorDetail);
    }

}

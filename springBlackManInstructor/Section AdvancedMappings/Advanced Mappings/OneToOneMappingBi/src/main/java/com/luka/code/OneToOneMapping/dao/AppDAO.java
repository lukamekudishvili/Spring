package com.luka.code.OneToOneMapping.dao;

import com.luka.code.OneToOneMapping.entity.Instructor;
import com.luka.code.OneToOneMapping.entity.InstructorDetail;

public interface AppDAO {
    void save(Instructor instructor);
    Instructor findInstructorById(int id);

    void deleteInstructorById(int id);
    InstructorDetail findInstructorDetailByID(int id);
    void deleteInstructorDetailById(int id);
}

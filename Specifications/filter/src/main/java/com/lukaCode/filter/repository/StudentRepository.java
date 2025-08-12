package com.lukaCode.filter.repository;

import com.lukaCode.filter.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StudentRepository extends JpaRepository<Student, Long>, JpaSpecificationExecutor<Student> {
    @Query("from Student a where a.name=:student_name")
    Student findByName(@Param("student_name") String name);
}

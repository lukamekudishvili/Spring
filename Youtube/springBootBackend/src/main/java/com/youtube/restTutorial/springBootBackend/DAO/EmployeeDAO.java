package com.youtube.restTutorial.springBootBackend.DAO;

import com.youtube.restTutorial.springBootBackend.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDAO extends CrudRepository<Employee, Long> {
}

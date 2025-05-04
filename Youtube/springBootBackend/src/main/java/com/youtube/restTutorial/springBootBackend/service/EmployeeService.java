package com.youtube.restTutorial.springBootBackend.service;

import com.youtube.restTutorial.springBootBackend.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee findById(Long id) throws Throwable;
    List<Employee> findAll();
    Employee save(Employee employee);

    void delete(Employee employee);
    void delete(Long id);

}

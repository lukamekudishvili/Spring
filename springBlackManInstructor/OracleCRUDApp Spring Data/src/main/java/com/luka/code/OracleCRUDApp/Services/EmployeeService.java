package com.luka.code.OracleCRUDApp.Services;

import com.luka.code.OracleCRUDApp.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    Employee findById(int id);
    List<Employee> findByLastName(String lastName);
    List<Employee> findLikeEmail(String email);

    void save(Employee employee);
}

package com.restCrud.CRUDAPP.DAO;

import com.restCrud.CRUDAPP.Entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
    Employee findById(int id);
    Employee save(Employee employee);
    void deleteById(int id);

}

package com.youtube.restTutorial.springBootBackend.service;

import com.youtube.restTutorial.springBootBackend.DAO.EmployeeDAO;
import com.youtube.restTutorial.springBootBackend.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public Employee findById(Long id) {
        return employeeDAO.findById(id).orElse(null);
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> employees=new ArrayList<>();
        employeeDAO.findAll().forEach(emp ->employees.add(emp));
        return employees;
    }



    @Override
    public Employee save(Employee employee) {
        return employeeDAO.save(employee);
    }

    @Override
    public void delete(Employee employee) {
        employeeDAO.delete(employee);
    }

    @Override
    public void delete(Long id) {
        employeeDAO.deleteById(id);
    }
}

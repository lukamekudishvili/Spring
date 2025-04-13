package com.restCrud.CRUDAPP.DAO;

import com.restCrud.CRUDAPP.Entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> employees = new ArrayList<>();
        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee", Employee.class);
        employees = theQuery.getResultList();
        return employees;
    }

    @Override
    public void deleteById(int id) {
        entityManager.remove(entityManager.find(Employee.class, id));
    }

    @Override
    public Employee save(Employee employee) {
        Employee dbEmployee = entityManager.merge(employee);

        return dbEmployee;
    }

    @Override
    public Employee findById(int id) {
        Employee employee = entityManager.find(Employee.class, id);

        return employee;
    }
}
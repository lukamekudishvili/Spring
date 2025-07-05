//package com.luka.code.OracleCRUDApp.Services;
//
//import com.luka.code.OracleCRUDApp.DAO.EmployeeDAO;
//import com.luka.code.OracleCRUDApp.entity.Employee;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//@Service
//public class EmployeeServiceImpl implements EmployeeService {
//    private final EmployeeDAO employeeDAO;
//
//    @Autowired
//    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
//        this.employeeDAO = employeeDAO;
//    }
//
//    @Override
//    public List<Employee> findAll() {
//
//        return employeeDAO.findAll();
//
//    }
//
//    @Override
//    public Employee findById(int id) {
//        return employeeDAO.findById(id);
//    }
//
//    @Override
//    public List<Employee> findByLastName(String lastName) {
//        return employeeDAO.findByLastName(lastName);
//    }
//
//    @Override
//    public List<Employee> findLikeEmail(String email) {
//        return employeeDAO.findLikeEmail(email);
//    }
//
//    @Override
//    @Transactional
//    public void save(Employee employee) {
//        employeeDAO.save(employee);
//    }
//
//    @Override
//    @Transactional
//    public boolean delete(Employee employee) {
//        return employeeDAO.delete(employee);
//    }
//
//    @Override
//    @Transactional
//    public boolean delete(int id) {
//        return employeeDAO.delete(id);
//    }
//
//}
//package com.luka.code.OracleCRUDApp.DAO;
//
//import com.luka.code.OracleCRUDApp.entity.Employee;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.TypedQuery;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class EmployeeDAOImpl implements EmployeeDAO {
//    private final EntityManager entityManager;
//
//    @Autowired
//    public EmployeeDAOImpl(EntityManager entityManager) {
//        this.entityManager = entityManager;
//    }
//
//    @Override
//    public List<Employee> findAll() {
//        TypedQuery<Employee> query = entityManager.createQuery("SELECT e FROM Employee e", Employee.class);
//        return query.getResultList();
//    }
//
//    @Override
//    public Employee findById(int id) {
//        return entityManager.find(Employee.class, id);
//    }
//
//    @Override
//    public List<Employee> findByLastName(String lastName) {
//        TypedQuery<Employee> query = entityManager.createQuery("SELECT e FROM Employee e WHERE lastName=:lastName", Employee.class);
//        query.setParameter("lastName", lastName);
//
//        return query.getResultList();
//    }
//
//    @Override
//    public List<Employee> findLikeEmail(String email) {
//        TypedQuery<Employee> query = entityManager.createQuery("SELECT e FROM Employee e WHERE email like :email", Employee.class);
//        query.setParameter("email", "%" + email);
//
//        return query.getResultList();
//    }
//
//    @Override
//    public void save(Employee employee) {
//
//        entityManager.persist(employee);
//    }
//
//    @Override
//    public boolean delete(Employee employee) {
//        return delete(employee.getId());
//    }
//
//    @Override
//    public boolean delete(int id) {
//
//        Employee employee = entityManager.find(Employee.class, id);
//        if (employee == null) {
//            return false;
//        }
//        entityManager.remove(employee);
//        return true;
//
//    }
//}
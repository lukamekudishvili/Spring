package com.luka.code.OracleCRUDApp.DAO;

import com.luka.code.OracleCRUDApp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}

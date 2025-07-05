//package com.luka.code.OracleCRUDApp.controllers;
//
//import com.luka.code.OracleCRUDApp.DAO.EmployeeDAO;
//import com.luka.code.OracleCRUDApp.Services.EmployeeService;
//import com.luka.code.OracleCRUDApp.entity.Employee;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api")
//public class EmployeeController {
//    private final EmployeeService employeeService;
//
//    @Autowired
//    public EmployeeController(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }
//
//    @GetMapping("/employees")
//    public List<Employee> getEmployees() {
//        return employeeService.findAll();
//    }
//
//    @GetMapping("/employees/{empId}")
//    public Employee getEmployee(@PathVariable int empId) {
//        return employeeService.findById(empId);
//    }
//
//    @GetMapping("/employees/getEmployeeByLastName/{lastName}")
//    public List<Employee> getEmployeeByLastName(@PathVariable String lastName) {
//        return employeeService.findByLastName(lastName);
//    }
//
//    @GetMapping("/employees/getEmployeeByEmail{email}")
//    public List<Employee> getEmployeeByEmail(@PathVariable String email) {
//        return employeeService.findLikeEmail(email);
//    }
//
//    /*---------------------------------------------------------------------------*/
//
//    @PostMapping("/employees/saveEmployee")
//    public void addEmployee(@RequestBody Employee employee) {
//         employeeService.save(employee);
//
//    }
//}

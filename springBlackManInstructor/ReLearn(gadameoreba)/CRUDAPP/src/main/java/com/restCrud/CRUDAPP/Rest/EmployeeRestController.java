package com.restCrud.CRUDAPP.Rest;

import com.restCrud.CRUDAPP.DAO.EmployeeDAO;
import com.restCrud.CRUDAPP.Entity.Employee;
import com.restCrud.CRUDAPP.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getEmployeeList() {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        Employee employee = employeeService.findById(id);
        if (employee == null) {
            throw new RuntimeException("Employee is not found");
        } else {
            return employee;
        }
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        employee.setId(0);
        Employee dbEmployee=employeeService.save(employee);

        return dbEmployee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        Employee updatedEmployee= employeeService.save(employee);

        return updatedEmployee;
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable int id){
        if(employeeService.findById(id)!=null){
            employeeService.deleteById(id);
            return;
        }
        throw new RuntimeException("No employee with id: "+id);
    }

}

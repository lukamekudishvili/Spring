package com.youtube.restTutorial.springBootBackend.Controller;

import com.youtube.restTutorial.springBootBackend.model.Employee;
import com.youtube.restTutorial.springBootBackend.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class  EmployeeController {
    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/allEmployees")
    public List<Employee> getEmployees(){
        return employeeService.findAll();
    }

    @GetMapping("/employee")
    public ResponseEntity<Employee> getEmployee(@RequestParam Long id) throws Throwable {
        return new ResponseEntity<>(employeeService.findById(id),HttpStatus.OK);


    }

    @PostMapping("/employee")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        return new ResponseEntity<>(employeeService.save(employee), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete")
    public void deleteEmployee(Employee employee){
        employeeService.delete(employee);
    }

    @DeleteMapping("/delete/byId")
    public void deleteEmployeeById(@RequestParam Long id){
        employeeService.delete(id);
    }
}

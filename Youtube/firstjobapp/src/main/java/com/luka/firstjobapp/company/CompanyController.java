package com.luka.firstjobapp.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CompanyController {
    private CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/companies")
    public ResponseEntity<List<Company>> getAllCompanies() {
        return new ResponseEntity<>(companyService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/company")
    public ResponseEntity<Company> saveCompany(@RequestBody Company company) {
        return new ResponseEntity<>(companyService.createCompany(company), HttpStatus.CREATED);
    }

    @DeleteMapping("/company")
    public ResponseEntity<String> deletecompany(@RequestParam Long id) {
        boolean isDeleted = companyService.deleteById(id);
        if (isDeleted) {
            return new ResponseEntity<>("Deleted Successfullt", HttpStatus.OK);
        }
        return new ResponseEntity<>("Not found Company to delete",HttpStatus.NOT_FOUND);
    }

}

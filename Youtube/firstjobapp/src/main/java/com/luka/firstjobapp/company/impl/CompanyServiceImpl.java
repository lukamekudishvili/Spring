package com.luka.firstjobapp.company.impl;

import com.luka.firstjobapp.company.Company;
import com.luka.firstjobapp.company.CompanyRepository;
import com.luka.firstjobapp.company.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {
    private final CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    @Override
    public Company createCompany(Company company) {
        return companyRepository.save(company);
    }


    @Override
    public boolean deleteById(Long id) {
        Company company = findById(id);
        if (company != null) {
            companyRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Company findById(Long id) {
        return companyRepository.findById(id).orElse(null);
    }

//    @Override
//    public boolean updateCompany(Long id, Company company) {
//        Optional<Company> companyOptional=companyRepository.findById(id);
//
//        if(companyOptional.isPresent()){
//            Company companyToUpdate=companyOptional.get();
//
//            return true;
//        }
//        return false;
//    }

}

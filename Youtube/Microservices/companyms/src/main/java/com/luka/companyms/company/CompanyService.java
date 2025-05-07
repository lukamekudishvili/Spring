package com.luka.companyms.company;

import java.util.List;

public interface CompanyService {
    List<Company> findAll();

//    boolean updateCompany(Long id,Company company);

    Company createCompany(Company company);
    boolean deleteById(Long id);
    Company findById(Long id);

}

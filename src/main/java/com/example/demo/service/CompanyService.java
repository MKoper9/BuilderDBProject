package com.example.demo.service;

import com.example.demo.model.Company;
import com.example.demo.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {
    private CompanyRepository companyRepository;

    @Autowired
    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Company saveCompany(Company company){
        return companyRepository.save(company);
    }

    public Company findById(Long id) {
        return companyRepository.findById(id).orElseGet(null);
    }

    public List<Company> findAllCompany() {
        return companyRepository.findAll();
    }

    public Company findByName(String name) {
        return companyRepository.findByName(name);
    }

    public void deleteCompanyById(Long id) {
        companyRepository.deleteById(id);
    }

    public Company updateCompany(Company company) {
        Company existingCompany = companyRepository.findById(company.getCompanyId()).orElse(null);
        existingCompany.setCompanyName(company.getCompanyName());
        existingCompany.setCompanyName(company.getRegion());
        existingCompany.setCompanyName(company.getCity());
        existingCompany.setCompanyName(company.getStreet());
        existingCompany.setCompanyName(company.getZipCode());
        return companyRepository.save(existingCompany);
    }


}

package com.example.demo.service;

import com.example.demo.model.Company;
import com.example.demo.repository.ConstructionCompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyService {
    private ConstructionCompanyRepository companyRepository;

    @Autowired
    public CompanyService(ConstructionCompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Optional<Company> findById(Long id){
        return companyRepository.findById(id);
    }
}

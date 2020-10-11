package com.example.demo.service;

import com.example.demo.model.ConstructionCompany;
import com.example.demo.repository.ConstructionCompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ConstructionCompanyService {
    private ConstructionCompanyRepository companyRepository;

    @Autowired
    public ConstructionCompanyService(ConstructionCompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public ConstructionCompany findById(Long id){
        Optional<ConstructionCompany> constructionCompany = companyRepository.findById(id);
        return constructionCompany.orElseGet(null);
    }
}

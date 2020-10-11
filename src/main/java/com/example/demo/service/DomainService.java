package com.example.demo.service;

import com.example.demo.model.ConstructionCompany;
import com.example.demo.model.Domain;
import com.example.demo.repository.DomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DomainService {

    private DomainRepository domainRepository;

    @Autowired
    public DomainService(DomainRepository domainRepository) {
        this.domainRepository = domainRepository;
    }

    public Domain findById(Long id){
        Optional<Domain> domain = domainRepository.findById(id);
        return domain.orElseGet(null);
    }

}

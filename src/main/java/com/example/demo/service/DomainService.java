package com.example.demo.service;

import com.example.demo.model.Domain;
import com.example.demo.repository.DomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DomainService {

    private DomainRepository domainRepository;

    @Autowired
    public DomainService(DomainRepository domainRepository) {
        this.domainRepository = domainRepository;
    }

    public Optional<Domain> findById(Long id){
        return domainRepository.findById(id);
    }

    public List<Domain>findAll(){
        return domainRepository.findAll();
    }

    public void addDomain(String name){
        Domain domain = new Domain(name);
        domainRepository.save(domain);
    }
}

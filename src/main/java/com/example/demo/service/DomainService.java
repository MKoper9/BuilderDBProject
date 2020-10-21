package com.example.demo.service;

import com.example.demo.model.Company;
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

    public Domain findById(Long id){
        return domainRepository.findById(id).orElseGet(null);
    }

    public List<Domain>findAllDomain(){
        return domainRepository.findAll();
    }

    public void addDomain(String name){
        Domain domain = new Domain(name);
        domainRepository.save(domain);
    }

    public Domain saveDomain(Domain domain) {
        return domainRepository.save(domain);
    }

    public Domain findByName(String name) {
        return domainRepository.findByName(name);
    }

    public void deleteCompanyById(Long id) {
        domainRepository.deleteById(id);
    }

    public Domain updateDomain(Domain domain) {
        Optional<Domain> domainOpt = domainRepository.findById(domain.getDomainId());
        if(domainOpt.isPresent()) {
            Domain existingDomain = domainOpt.get();
            existingDomain.setDomainName(domain.getDomainName());
            return domainRepository.save(existingDomain);
        }else {
            throw new RuntimeException("domain not found");
        }
    }
}

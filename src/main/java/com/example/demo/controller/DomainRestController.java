package com.example.demo.controller;

import com.example.demo.model.Domain;
import com.example.demo.service.DomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/domain")
public class DomainRestController {

    private DomainService domainService;

    @Autowired
    public DomainRestController(DomainService domainService) {
        this.domainService = domainService;
    }

    @PostMapping("/add")
    public Domain addCompany(@RequestBody Domain domain){
        return domainService.saveDomain(domain);
    }

    @GetMapping("/getById/{domain_id}")
    public Domain getCompanyById(@PathVariable("domain_id") Long domain_id) {
        Domain domainOpt = domainService.findById(domain_id);
        return domainOpt;
    }

    @GetMapping("/getAll")
    public List<Domain> findAllCompany(){
        return domainService.findAllDomain();
    }

    @GetMapping("/getName/{domain}")
    public Domain getDomainByName(@PathVariable("domain") String name){
        return domainService.findByName(name);
    }

    @DeleteMapping("/deleteById/{id}")
    public String deleteDomainByName(@PathVariable("id") Long id){
        domainService.deleteCompanyById(id);
        return "Delete Succesfull";
    }

    @PutMapping("/update")
    public Domain updateCompany(@RequestBody Domain domain){
        return domainService.updateDomain(domain);
    }

}

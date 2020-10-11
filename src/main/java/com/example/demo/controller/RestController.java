package com.example.demo.controller;

import com.example.demo.model.Domain;
import com.example.demo.service.ConstructionCompanyService;
import com.example.demo.service.DomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private DomainService domainService;
    private ConstructionCompanyService companyService;

    @Autowired
    public RestController(DomainService domainService, ConstructionCompanyService companyService) {
        this.domainService = domainService;
        this.companyService = companyService;
    }

    @GetMapping("/domain/id={domain_id}")
    public Domain getDomainById(@PathVariable("domain_id") Long domain_id) {
        return domainService.findById(domain_id);
    }

    @GetMapping("/company/id={company_id}")
    public Domain getCompanyById(@PathVariable("company_id") Long company_id) {
        return domainService.findById(company_id);
    }
}

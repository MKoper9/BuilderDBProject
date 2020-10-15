package com.example.demo.controller;

import com.example.demo.model.Company;
import com.example.demo.model.Domain;
import com.example.demo.service.CompanyService;
import com.example.demo.service.DomainService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private DomainService domainService;
    private CompanyService companyService;

    @Autowired
    public RestController(DomainService domainService, CompanyService companyService) {
        this.domainService = domainService;
        this.companyService = companyService;
    }

    @GetMapping("/domain/id={domain_id}")
    public Domain getDomainById(@PathVariable("domain_id") Long domain_id) {
        Optional<Domain> domainOpt = domainService.findById(domain_id);
        return domainOpt.orElseGet(Domain::new);
    }

    @GetMapping("/company/id={company_id}")
    public Company getCompanyById(@PathVariable("company_id") Long company_id) {
        Optional<Company> compOpt = companyService.findById(company_id);
        return compOpt.orElseGet(Company::new);
    }

    @GetMapping("/company/all")
    public List<Company> findAllCompany(){
        return companyService.findAll();
    }

    @GetMapping("/domain/all")
    public List<Domain> findAllDomain(){
        return domainService.findAll();
    }
/*
    @PostMapping("/domain/add={name}")
    public void addDomain(@PathVariable("name")String name){
        domainService.addDomain(name);
    }
 */

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/company/name={company}")
    public Company getCompanyByName(@PathVariable("company") String name){
        return companyService.findByName(name);
    }


}

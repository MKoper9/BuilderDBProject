package com.example.demo.controller;

import com.example.demo.model.Company;
import com.example.demo.model.Domain;
import com.example.demo.service.CompanyService;
import com.example.demo.service.DomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private DomainService domainService;
    private CompanyService companyService;

    @Autowired
    public RestController(DomainService domainService, CompanyService companyService) {
        this.domainService = domainService;
        this.companyService = companyService;
    }

    @PostMapping("company/add")
    public Company addCompany(@RequestBody Company company){
        return companyService.saveCompany(company);
    }

    @GetMapping("/domain/getById/{domain_id}")
    public Domain getDomainById(@PathVariable("domain_id") Long domain_id) {
        Domain domainOpt = domainService.findById(domain_id);
        return domainOpt;
    }

    @GetMapping("/company/getById/{company_id}")
    public Company getCompanyById(@PathVariable("company_id") Long company_id) {
        Company compOpt = companyService.findById(company_id);
        return compOpt;
    }

    @GetMapping("/company/getAll")
    public List<Company> findAllCompany(){
        return companyService.findAllCompany();
    }

    @GetMapping("/domain/getAll")
    public List<Domain> findAllDomain(){
        return domainService.findAllDomain();
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/company/getName/{company}")
    public Company getCompanyByName(@PathVariable("company") String name){
        return companyService.findByName(name);
    }

    @DeleteMapping("/company/deleteById/{id}")
    public String deleteCompanyByName(@PathVariable("id") Long id){
        return companyService.deleteCompanyById(id);
    }

    @PutMapping("/company/update")
    public Company updateCompany(@RequestBody Company company){
        return companyService.updateCompany(company);
    }




}

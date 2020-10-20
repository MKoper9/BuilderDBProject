package com.example.demo.controller;

import com.example.demo.model.Company;
import com.example.demo.service.CompanyService;
import com.example.demo.service.DomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DomainRestController {

    private DomainService domainService;

    @Autowired
    public DomainRestController(DomainService domainService) {
        this.domainService = domainService;
    }

//    @PostMapping("company/add")
//    public Company addCompany(@RequestBody Company company){
//        return companyService.saveCompany(company);
//    }
//
//    @GetMapping("/company/getById/{company_id}")
//    public Company getCompanyById(@PathVariable("company_id") Long company_id) {
//        Company compOpt = companyService.findById(company_id);
//        return compOpt;
//    }
//
//    @GetMapping("/company/getAll")
//    public List<Company> findAllCompany(){
//        return companyService.findAllCompany();
//    }
//
//    @GetMapping("/hello")
//    public String hello(){
//        return "hello";
//    }
//
//    @GetMapping("/company/getName/{company}")
//    public Company getCompanyByName(@PathVariable("company") String name){
//        return companyService.findByName(name);
//    }
//
//    @DeleteMapping("/company/deleteById/{id}")
//    public String deleteCompanyByName(@PathVariable("id") Long id){
//        return companyService.deleteCompanyById(id);
//    }
//
//    @PutMapping("/company/update")
//    public Company updateCompany(@RequestBody Company company){
//        return companyService.updateCompany(company);
//    }

}

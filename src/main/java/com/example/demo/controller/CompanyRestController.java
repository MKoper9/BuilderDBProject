package com.example.demo.controller;

import com.example.demo.model.Company;
import com.example.demo.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RequestMapping(value = "/company")
@org.springframework.web.bind.annotation.RestController
public class CompanyRestController {

    private CompanyService companyService;

    @Autowired
    public CompanyRestController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @PostMapping("/add")
    public Company addCompany(@RequestBody Company company){
        return companyService.saveCompany(company);
    }

    @GetMapping("/{company_id}")
    public Company getCompanyById(@PathVariable("company_id") Long company_id) {
        Company compOpt = companyService.findById(company_id);
        return compOpt;
    }

    @GetMapping("/all")
    public List<Company> findAllCompany(){
        return companyService.findAllCompany();
    }

    @GetMapping("/{company}")
    public Company getCompanyByName(@PathVariable(value = "company") String name){
        return companyService.findByName(name);
    }

    @DeleteMapping("/delete={id}")
    public String deleteCompanyById(@PathVariable(value = "id") Long id){
        companyService.deleteCompanyById(id);
        return "Delete Succesfull";
    }

    @PutMapping("/update")
    public Company updateCompany(@RequestBody Company company){
        return companyService.updateCompany(company);
    }

    @GetMapping("/domain={id}")
    public Set<Company>findCompaniesByDomainId(@PathVariable("id") Integer id){
        return companyService.findCompanyByDomainId(id);
    }

}

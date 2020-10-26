package com.example.demo.controller;

import com.example.demo.model.Company;
import com.example.demo.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FrontendController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<Company> companyList = companyService.findAllCompany();
        model.addAttribute("listComapnies", companyList);
        return "index";
    }
}

package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontendController {

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/")
    public String indext() {
        return "index";
    }
}

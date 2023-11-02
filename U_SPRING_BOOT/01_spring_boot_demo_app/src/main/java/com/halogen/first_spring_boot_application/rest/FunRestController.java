package com.halogen.first_spring_boot_application.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayWelcome() {
        System.out.println("spring boot application output");
        return "spring boot first rest api";
    }

    @GetMapping("/about")
    public String about() {
        return "about api";
    }
}
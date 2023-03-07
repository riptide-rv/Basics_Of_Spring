package com.example.basicsofspring.BasicSpringProject.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello(){
        System.out.println("Inside Controller");
        return "Hello Everyone!!!";
    }
}

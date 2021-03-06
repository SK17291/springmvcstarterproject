package com.sk.FirstProject.controller;

import com.sk.FirstProject.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class RegistrationController {
    @GetMapping("registration")
    public String regit(@ModelAttribute ("registration") Registration registration){
        return "registration";
    }
    @PostMapping("registration")
    public  String postregit(@ModelAttribute("registration") Registration registration){
        System.out.println("Registration: "+ registration.getName());
        return "redirect:registration";
    }
}

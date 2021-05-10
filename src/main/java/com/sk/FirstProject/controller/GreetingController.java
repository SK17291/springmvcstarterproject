package com.sk.FirstProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class GreetingController {
    @RequestMapping("greet")
    public String greet(Map<String,Object> model){
        model.put("message","Hello There");
        return "greeting";
    }

    @RequestMapping("thyme")
    public  String thyme(Map<String,Object> model){
        model.put("message","Hey Thymeleaf");
        return "thyme";
    }
}

package com.sk.FirstProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @RequestMapping("home")
    public void home(){
//        ModelAndView mv = new ModelAndView();
//        int i= Integer.parseInt(request.getParameter("t1"));
//        int j= Integer.parseInt(request.getParameter("t2"));
//        int k= i+j;
//        mv.setViewName("display.jsp");
//        mv.addObject("result",k);
//        return mv;
        System.out.println("hi");
    }
}

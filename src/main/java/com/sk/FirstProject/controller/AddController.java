package com.sk.FirstProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class AddController {

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j , HttpServletRequest request, HttpServletResponse response){
//        HttpSession session=request.getSession();
//        int i = Integer.parseInt(request.getParameter("t1"));
//        int j = Integer.parseInt(request.getParameter("t2"));
        int k=i+j;
//        session.setAttribute("result",k);
        ModelAndView mv = new ModelAndView();
        mv.addObject("result",k);
        mv.setViewName("display");

        return mv;
    }
}

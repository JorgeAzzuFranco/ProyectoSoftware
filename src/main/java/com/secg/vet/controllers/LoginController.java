package com.secg.vet.controllers;

import com.secg.vet.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @Autowired
    UserService userService;

    @GetMapping("/vet/homevet")
    public String vetMap(){
        return "/vet/homevet";
    }

    @GetMapping(value = {"/", "/login"})
    public ModelAndView login() {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("login");
        return mav;
    }

    @GetMapping("/AccessDenied")
    public String error(){
        return "AccessDenied";
    }
    @GetMapping("/home")
    public ModelAndView home(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("main");
        return mav;
    }
}

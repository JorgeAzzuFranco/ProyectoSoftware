package com.secg.vet.controllers;

import com.secg.vet.domain.User;
import com.secg.vet.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.security.Principal;

@Controller
public class Login2Controller {

    @Autowired
    UserService userService;

    @GetMapping(value = {"/","/login"})
    public ModelAndView login(){

        ModelAndView mav = new ModelAndView();
        mav.setViewName("login");
        return mav;
    }


    @GetMapping("/home")
    public ModelAndView home(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("main");
        return mav;
    }

}

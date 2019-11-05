package com.secg.vet.controllers;

import com.secg.vet.domain.Rol;
import com.secg.vet.domain.User;
import com.secg.vet.repositories.RolRepository;
import com.secg.vet.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class RegisterController {

    @Autowired
    UserService userService;
    @Autowired
    RolRepository rolRepository;

    @GetMapping("/addUser")
    public String addUser(Model model){
        User usuario = new User();
        List<Rol> roles = rolRepository.findAll();
        Rol newRol = new Rol();
        model.addAttribute("user", usuario);
        model.addAttribute("roles",roles);
        model.addAttribute("rol",newRol);
        return "addUser";
    }

    @PostMapping("/saveUser")
    public String saveProduct(@ModelAttribute User user, Model model){
        userService.updateOrCreate(user);
        return "main";
    }

}

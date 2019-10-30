package com.secg.vet.controllers;

import com.secg.vet.domain.Pet;
import com.secg.vet.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PetController {

    @Autowired
    PetService petService;

    @GetMapping("/pet")
    public String pet(Model model){
        List<Pet> petList = petService.findAll();
        model.addAttribute("petList", petList);
        return "pet";
    }

    @GetMapping("/petDetails")
    public String petDetails(@RequestParam("id") Integer id, Model model){
        Pet pet = petService.findOne(id);
        model.addAttribute("pet", pet);
        return "petDetails";
    }

}

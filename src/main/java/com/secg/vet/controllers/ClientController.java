package com.secg.vet.controllers;

import com.secg.vet.domain.Pet;
import com.secg.vet.domain.Client;
import com.secg.vet.repositories.PetRepository;
import com.secg.vet.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ClientController {

    @Autowired
    ClientService clientService;
    @Autowired
    PetRepository petRepository;

    @GetMapping("admin/addClient")
    public String addClient(Model model){
        Client cliente = new Client();
        List<Pet> mascotas = petRepository.findAll();
        model.addAttribute("client", cliente);
        model.addAttribute("mascota",mascotas);

        return "/admin/addClient";
    }

    //@PostMapping("admin/saveClient")
    /*
    public String saveProduct(@ModelAttribute Client client, Model model){
        if(!clientService.clientExists(client)){
            clientService.updateOrCreate(client);
        }
        //return "/main";
    }*/

}
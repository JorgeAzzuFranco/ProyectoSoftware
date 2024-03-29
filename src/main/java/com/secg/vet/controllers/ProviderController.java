package com.secg.vet.controllers;

import com.secg.vet.domain.Provider;
import com.secg.vet.services.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProviderController {
    @Autowired
    ProviderService providerService;

    @GetMapping("/admin/listProvider")
    public String listProvider(Model model){
        List<Provider> providers = providerService.findAll();
        model.addAttribute("list",providers);
        return "/admin/listProvider";
    }

    @GetMapping("/admin/deleteProvider")
    public String deleteProvider(Model model,@RequestParam(value="id",required = true) String id){
        Provider provider = providerService.findOne(Integer.parseInt(id));
        providerService.delete(provider);
        List<Provider> providers = providerService.findAll();
        model.addAttribute("list",providers);
        return "/admin/listProvider";
    }

    @GetMapping("/admin/editProvider")
    public String editProvider(Model model,@RequestParam(value="id",required = true) String id){
        Provider provider = providerService.findOne(Integer.parseInt(id));
        model.addAttribute("provider",provider);
        return "/admin/addProvider";
    }

    @GetMapping("/admin/addProvider")
    public String addProvider(Model model){
        Provider provider = new Provider();
        model.addAttribute("provider",provider);
        return "/admin/addProvider";
    }
    @PostMapping("/admin/saveProvider")
    public String saveProvider(@ModelAttribute Provider provider, Model model){
        providerService.createOrUpdate(provider);
        List<Provider> providers = providerService.findAll();
        model.addAttribute("list",providers);
        return "/admin/listProvider";
    }

}

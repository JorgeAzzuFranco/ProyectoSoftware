package com.secg.vet.controllers;

import com.secg.vet.domain.Provider;
import com.secg.vet.domain.Warehouse;
import com.secg.vet.services.ProviderService;
import com.secg.vet.services.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class WarehouseController {

    @Autowired
    WarehouseService warehouseService;
    @Autowired
    ProviderService providerService;

    @GetMapping("/listProducts")
    public String pet(Model model){
        List<Warehouse> warehouseList = warehouseService.listarProductos();
        model.addAttribute("warehouseList", warehouseList);
        return "productList";
    }

    @GetMapping("/addProduct")
    public String addProduct(Model model){
        Warehouse warehouse = new Warehouse();
        List<Provider> listaP = providerService.findAll();
        model.addAttribute("warehouse", warehouse);
        model.addAttribute("provider",listaP);
        return "addProduct";
    }

    @PostMapping("/saveProduct")
    public String saveProduct(@ModelAttribute Warehouse warehouse, Model model){
        warehouseService.insertProduct(warehouse);
        List<Warehouse> warehouseList = warehouseService.listarProductos();
        model.addAttribute("warehouseList", warehouseList);
        return "productList";
    }

    @GetMapping("/admin/deleteProduct")
    public String deleteProduct(Model model,@RequestParam(value="id",required = true) String id){
        Warehouse warehouse = warehouseService.findOne(Integer.parseInt(id));
        warehouseService.deleteProduct(warehouse);
        List<Warehouse> warehouseList = warehouseService.listarProductos();
        model.addAttribute("warehouseList", warehouseList);
        return "productList";
    }

    @GetMapping("/admin/editProduct")
    public String editProvider(Model model,@RequestParam(value="id",required = true) String id){
        Warehouse warehouse = warehouseService.findOne(Integer.parseInt(id));
        List<Provider> listaP = providerService.findAll();
        model.addAttribute("warehouse", warehouse);
        model.addAttribute("provider",listaP);
        return "addProduct";
    }


}

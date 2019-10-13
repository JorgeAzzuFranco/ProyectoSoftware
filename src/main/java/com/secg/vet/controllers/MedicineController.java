package com.secg.vet.controllers;

import com.secg.vet.domain.Medicine;
import com.secg.vet.services.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MedicineController {

    @Autowired
    MedicineService medicineService;

    @GetMapping("/medicine")
    public String medicine(Model model){
        List<Medicine> medicineList = medicineService.findAll();
        model.addAttribute("medicineList", medicineList);
        return "medicine";
    }
}

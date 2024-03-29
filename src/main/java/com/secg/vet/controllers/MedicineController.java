package com.secg.vet.controllers;

import com.secg.vet.domain.Medicine;
import com.secg.vet.services.MedicineService;
import com.secg.vet.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class    MedicineController {

    @Autowired
    MedicineService medicineService;

    @Autowired
    PetService petService;

    @GetMapping("/medicine")
    public String medicine(Model model){
        List<Medicine> medicineList = medicineService.findAll();
        model.addAttribute("medicineList", medicineList);
        return "medicine";
    }

    @GetMapping(value = "/addMedicineForm")
    public String addMedicine(@RequestParam("id") Integer id, Model model){
        model.addAttribute("pet", petService.findOne(id));
        return "addMedicineForm";
    }

    @PostMapping("/addMedicine")
    public String addMedicine(@RequestParam("id") String id, String medicine, String quantity, String dose, Model model){
        medicineService.addMedicine(Integer.parseInt(id), medicine, Integer.parseInt(quantity), dose);
        model.addAttribute("pet", petService.findOne(Integer.parseInt(id)));
        return "petDetails";
    }

    @GetMapping("/deleteMedicine")
    public String deleteMedicine(@RequestParam("id") String id, @RequestParam("medicineId") String medicineId,
                                 Model model){
        medicineService.deleteMedicine(Integer.parseInt(id), Integer.parseInt(medicineId));
        model.addAttribute("pet", petService.findOne(Integer.parseInt(id)));
        return "petDetails";
    }
}

package com.secg.vet.controllers;

import com.secg.vet.services.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class WarehouseController {

    @Autowired
    WarehouseService warehouseService;


}

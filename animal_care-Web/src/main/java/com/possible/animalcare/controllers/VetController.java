package com.possible.animalcare.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VetController {

    @GetMapping("/vets")
    public String showVet(){
        return "vets/vet_index";
    }
}

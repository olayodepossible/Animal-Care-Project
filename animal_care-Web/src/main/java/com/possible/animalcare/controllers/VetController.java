package com.possible.animalcare.controllers;

import com.possible.animalcare.services.VetService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VetController {

    private VetService vetService;

    public VetController(@Qualifier("vetSDJService") VetService vetService) {
        this.vetService = vetService;
    }

    @GetMapping("/vets")
    public String showVets(Model model){
        model.addAttribute("vets", vetService.findAll());
        return "vets/vet_index";
    }
}

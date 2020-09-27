package com.possible.animalcare.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("/customers")
    public String listOfCustomer(){
        return "customers/customers-page";
    }
}

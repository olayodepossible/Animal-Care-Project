package com.possible.animalcare.controllers;

import com.possible.animalcare.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/customer")
public class CustomerController {
    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    public String listOfCustomer(Model model){
        model.addAttribute("customers", customerService.findAll());

        return "customers/customers-page";
    }
}

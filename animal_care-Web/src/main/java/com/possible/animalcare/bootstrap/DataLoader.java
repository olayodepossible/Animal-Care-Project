package com.possible.animalcare.bootstrap;

import com.possible.animalcare.model.Customer;
import com.possible.animalcare.model.Vet;
import com.possible.animalcare.service.CustomerService;
import com.possible.animalcare.service.VetService;
import com.possible.animalcare.service.mapService.CustomerServiceMap;
import com.possible.animalcare.service.mapService.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final CustomerService customerService;
    private final VetService vetService;

    public DataLoader() {
        this.customerService = new CustomerServiceMap();
        this.vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Customer customer1 = new Customer();
        customer1.setId(1L);
        customer1.setFirstName("John");
        customer1.setLastName("Doe");
        customerService.save(customer1);

        Customer customer2 = new Customer();
        customer1.setId(2L);
        customer1.setFirstName("Jane");
        customer1.setLastName("Doe");
        customerService.save(customer2);

        System.out.println("Loaded Customer...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Adex");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet1.setId(2L);
        vet1.setFirstName("James");
        vet1.setLastName("Bond");
        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}

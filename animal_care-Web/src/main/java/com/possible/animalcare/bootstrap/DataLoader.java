package com.possible.animalcare.bootstrap;

import com.possible.animalcare.model.*;
import com.possible.animalcare.services.CustomerService;
import com.possible.animalcare.services.PetTypeService;
import com.possible.animalcare.services.SpecialityService;
import com.possible.animalcare.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {
    private final CustomerService customerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private  final SpecialityService specialityService;

    public DataLoader(CustomerService customerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService) {
        this.customerService = customerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = petTypeService.findAll().size();
        if (count == 0){
            loadData();
        }


    }

    private void loadData() {
        // ======================= Pet Type ===============
        PetType dog = new PetType();
        dog.setName("DOG");
        PetType saveDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("CAT");
        PetType saveCatPetType = petTypeService.save(cat);

// ======================= Veterinary Doc. Area of Specialization ===============
        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality SaveRadiology = specialityService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality SaveSurgery = specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality SaveDentistry = specialityService.save(dentistry);


// ======================= Customer ===============
        Customer customer1 = new Customer();
        customer1.setFirstName("John");
        customer1.setLastName("Doe");
        customer1.setAddress("123, Abs Street");
        customer1.setCity("Miami");
        customer1.setTelephone("12345678");
        customerService.save(customer1);

// ======================= Pet ===============
        Pet johnDoePet = new Pet();
        johnDoePet.setName("Rosco");
        johnDoePet.setPetType(saveDogPetType);
        johnDoePet.setCustomer(customer1);
        johnDoePet.setBirthDay(LocalDate.now());
        customer1.getPets().add(johnDoePet);


        Customer customer2 = new Customer();
        customer2.setFirstName("Jane");
        customer2.setLastName("Doe");
        customer2.setAddress("163, Abc Street");
        customer2.setCity("Miami");
        customer2.setTelephone("123456785678");
        customerService.save(customer2);

        Pet jose = new Pet();
        jose.setName("Rosco");
        jose.setPetType(saveDogPetType);
        jose.setCustomer(customer2);
        jose.setBirthDay(LocalDate.now());
        customer1.getPets().add(jose);

        System.out.println("Loaded Customer...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Adex");
        vet1.getSpecialities().add(SaveRadiology);
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("James");
        vet2.setLastName("Bond");
        vet1.getSpecialities().add(SaveSurgery);
        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}

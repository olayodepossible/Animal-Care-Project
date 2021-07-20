package com.possible.animalcare.services.springDataJPA;

import com.possible.animalcare.model.Customer;
import com.possible.animalcare.repositories.CustomerRepository;
import com.possible.animalcare.repositories.PetRepository;
import com.possible.animalcare.repositories.PetTypeRepository;
import com.possible.animalcare.services.CustomerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service("customerSDJService")
//@Profile("springDataJPA")
public class CustomerSDJService implements CustomerService {
    private final CustomerRepository customerRepository;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;

    public CustomerSDJService(CustomerRepository customerRepository, PetRepository petRepository,
                              PetTypeRepository petTypeRepository) {
        this.customerRepository = customerRepository;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public Set<Customer> findAll() {
        Set<Customer> customers = new HashSet<>();
        customerRepository.findAll().forEach(customers::add);
        return customers;
    }

    @Override
    public Customer save(Customer object) {
        return customerRepository.save(object);
    }

    @Override
    public void delete(Customer object) {
        customerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        customerRepository.deleteById(aLong);
    }

    @Override
    public Customer findByLastName(String lastName) {
        return customerRepository.findByLastName(lastName);
    }
}

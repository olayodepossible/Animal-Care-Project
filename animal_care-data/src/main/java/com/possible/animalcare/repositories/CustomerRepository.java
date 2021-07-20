package com.possible.animalcare.repositories;

import com.possible.animalcare.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    Customer findByLastName(String lastName);
}

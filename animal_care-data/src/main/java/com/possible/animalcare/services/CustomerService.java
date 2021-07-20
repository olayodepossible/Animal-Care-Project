package com.possible.animalcare.services;

import com.possible.animalcare.model.Customer;


public interface CustomerService extends CrudService<Customer, Long>{
    Customer findByLastName(String lastName);
}

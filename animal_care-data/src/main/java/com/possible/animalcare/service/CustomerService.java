package com.possible.animalcare.service;

import com.possible.animalcare.model.Customer;


public interface CustomerService extends CrudService<Customer, Long>{
    Customer findByLastName(String lastName);
}

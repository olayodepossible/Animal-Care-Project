package com.possible.animalcare.service.mapService;

import com.possible.animalcare.model.Customer;
import com.possible.animalcare.service.CrudService;

import java.util.Set;

public class CustomerServiceMap extends AbstractMapService<Customer, Long> implements CrudService<Customer, Long> {
    @Override
    public Customer findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Customer> findAll() {
        return super.findAll();
    }

    @Override
    public Customer save(Customer object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Customer object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}

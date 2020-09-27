package com.possible.animalcare.service.mapService;

import com.possible.animalcare.model.Customer;
import com.possible.animalcare.service.CrudService;
import com.possible.animalcare.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CustomerServiceMap extends AbstractMapService<Customer, Long> implements CustomerService {
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
        return super.save( object);
    }

    @Override
    public void delete(Customer object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Customer findByLastName(String lastName) {
        return null;
    }
}

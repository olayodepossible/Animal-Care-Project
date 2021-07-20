package com.possible.animalcare.services.mapService;

import com.possible.animalcare.model.Customer;
import com.possible.animalcare.model.Pet;
import com.possible.animalcare.services.CustomerService;
import com.possible.animalcare.services.PetService;
import com.possible.animalcare.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CustomerServiceMap extends AbstractMapService<Customer, Long> implements CustomerService {
   private final PetTypeService petTypeService;
   private final PetService petService;

    public CustomerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

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
        if (object != null){
            object.getPets().forEach(pet -> {
                if (pet.getPetType() != null){
                    if (pet.getPetType().getId() == null){
                        pet.setPetType(petTypeService.save(pet.getPetType()));
                    }
                }
                else {
                    throw  new RuntimeException("Pet Type is required");
                }

                if (pet.getId() == null){
                    Pet savedPet = petService.save(pet);
                    pet.setId(savedPet.getId());
                }
            });
            return super.save( object);
        }
        else {
            return null;
        }

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

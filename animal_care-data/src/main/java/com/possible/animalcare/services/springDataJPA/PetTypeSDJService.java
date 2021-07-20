package com.possible.animalcare.services.springDataJPA;

import com.possible.animalcare.model.Customer;
import com.possible.animalcare.model.PetType;
import com.possible.animalcare.repositories.PetTypeRepository;
import com.possible.animalcare.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class PetTypeSDJService implements PetTypeService {
    private final PetTypeRepository petTypeRepository;

    public PetTypeSDJService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public PetType findById(Long aLong) {
        return petTypeRepository.findById(aLong).orElse(null);
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes = new HashSet<>();
        petTypeRepository.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType save(PetType object) {
        return petTypeRepository.save(object);
    }

    @Override
    public void delete(PetType object) {
        petTypeRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petTypeRepository.deleteById(aLong);
    }
}

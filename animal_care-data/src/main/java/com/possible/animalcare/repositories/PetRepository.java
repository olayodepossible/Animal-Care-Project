package com.possible.animalcare.repositories;

import com.possible.animalcare.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}

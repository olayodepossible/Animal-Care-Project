package com.possible.animalcare.repositories;

import com.possible.animalcare.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}

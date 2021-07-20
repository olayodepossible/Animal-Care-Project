package com.possible.animalcare.repositories;

import com.possible.animalcare.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}

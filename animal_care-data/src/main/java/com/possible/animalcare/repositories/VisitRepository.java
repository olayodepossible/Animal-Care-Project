package com.possible.animalcare.repositories;

import com.possible.animalcare.model.visit.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}

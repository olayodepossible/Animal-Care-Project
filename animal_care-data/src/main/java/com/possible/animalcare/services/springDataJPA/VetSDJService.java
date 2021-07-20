package com.possible.animalcare.services.springDataJPA;

import com.possible.animalcare.model.Customer;
import com.possible.animalcare.model.Vet;
import com.possible.animalcare.repositories.VetRepository;
import com.possible.animalcare.services.VetService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service("vetSDJService")
public class VetSDJService implements VetService {
    private final VetRepository vetRepository;

    public VetSDJService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Vet findById(Long aLong) {
        return vetRepository.findById(aLong).orElse(null);
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet save(Vet object) {
        return vetRepository.save(object);
    }

    @Override
    public void delete(Vet object) {
        vetRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vetRepository.deleteById(aLong);
    }
}

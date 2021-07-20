package com.possible.animalcare.services.springDataJPA;

import com.possible.animalcare.model.PetType;
import com.possible.animalcare.model.Speciality;
import com.possible.animalcare.repositories.SpecialtyRepository;
import com.possible.animalcare.services.SpecialityService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class SpecialtySDJService implements SpecialityService {
    private SpecialtyRepository specialtyRepository;

    public SpecialtySDJService(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialtyRepository.findById(aLong).orElse(null);
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialties = new HashSet<>();
        specialtyRepository.findAll().forEach(specialties::add);
        return specialties;
    }

    @Override
    public Speciality save(Speciality object) {
        return specialtyRepository.save(object);
    }

    @Override
    public void delete(Speciality object) {
        specialtyRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialtyRepository.deleteById(aLong);
    }
}

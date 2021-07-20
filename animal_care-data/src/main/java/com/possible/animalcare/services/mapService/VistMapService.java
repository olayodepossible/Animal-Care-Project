package com.possible.animalcare.services.mapService;

import com.possible.animalcare.model.visit.Visit;
import com.possible.animalcare.services.VisitService;

import java.util.Set;

public class VistMapService extends AbstractMapService<Visit, Long> implements VisitService {

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Visit save(Visit visit) {
        if (visit.getPet() == null || visit.getPet().getCustomer() == null ||
                visit.getPet().getId() == null || visit.getPet().getCustomer().getId() == null){
            throw new RuntimeException("Invalid visit");
        }
        return super.save(visit);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);

    }
}

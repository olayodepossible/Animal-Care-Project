package com.possible.animalcare.model.visit;

import com.possible.animalcare.model.BaseEntity;
import com.possible.animalcare.model.Pet;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;


public class Visit extends BaseEntity {

    @Column(name = "visit_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

//    @NotEmpty
    @Column(name = "description")
    private String description;

private Pet pet;

    /**
     * Creates a new instance of Visit for the current date
     */
    public Visit() {
        this.date = LocalDate.now();
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pet getPetId() {
        return this.pet;
    }

    public void setPetId(Pet pet) {
        this.pet = pet;
    }

}

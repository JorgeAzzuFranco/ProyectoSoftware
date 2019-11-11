package com.secg.vet.services;

import com.secg.vet.domain.Pet;

import java.util.List;

public interface PetService {

    public List<Pet> findAll();
    public Pet findOne(Integer id);
    public void addPet(Pet pet);
    public Pet findByName(String name);
    public void deletePet(Pet pet);

}

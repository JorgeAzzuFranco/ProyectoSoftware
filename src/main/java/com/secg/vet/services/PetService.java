package com.secg.vet.services;

import com.secg.vet.domain.Pet;

import java.util.List;

public interface PetService {

    public List<Pet> findAll();
    public Pet findOne(Integer id);
}

package com.secg.vet.services;

import com.secg.vet.domain.Pet;
import com.secg.vet.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetServiceImpl implements PetService{

    @Autowired
    PetRepository petRepository;

    @Override
    public List<Pet> findAll() {
        return petRepository.findAll();
    }

    @Override
    public Pet findOne(Integer id) {
        return petRepository.getOne(id);
    }

}

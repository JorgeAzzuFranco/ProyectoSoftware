package com.secg.vet.services;

import com.secg.vet.domain.Rol;
import com.secg.vet.repositories.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolServiceImpl implements RolService {

    @Autowired
    RolRepository rolRepository;

    @Override
    public List<Rol> findAll() {
        return rolRepository.findAll();
    }

    @Override
    public Rol findOne(Integer id) {
        return rolRepository.getOne(id);
    }
}

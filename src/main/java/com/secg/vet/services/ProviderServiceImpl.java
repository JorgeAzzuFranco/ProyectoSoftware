package com.secg.vet.services;

import com.secg.vet.domain.Proveedor;
import com.secg.vet.repositories.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderServiceImpl implements ProviderService {

    @Autowired
    ProviderRepository providerRepository;

    @Override
    public List<Proveedor> findAll() {
        return providerRepository.findAll();
    }

    @Override
    public Proveedor findOne(Integer id) {
        return providerRepository.getOne(id);
    }
}

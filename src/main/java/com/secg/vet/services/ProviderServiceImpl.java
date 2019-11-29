package com.secg.vet.services;

import com.secg.vet.domain.Provider;
import com.secg.vet.repositories.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProviderServiceImpl implements ProviderService {

    @Autowired
    ProviderRepository providerRepository;

    @Override
    public List<Provider> findAll() {
        return providerRepository.findAll();
    }

    @Override
    public Provider findOne(Integer id) {
        return providerRepository.getOne(id);
    }

    @Override
    public Provider findByName(String nombre) {
        return providerRepository.findByName(nombre);
    }

    @Transactional
    @Override
    public void delete(Provider provider) {
        providerRepository.delete(provider);
    }

    @Transactional
    @Override
    public void createOrUpdate(Provider provider) {
        providerRepository.save(provider);
    }
}

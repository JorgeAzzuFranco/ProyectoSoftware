package com.secg.vet.services;

import com.secg.vet.domain.Provider;

import java.util.List;

public interface ProviderService {
    public List<Provider> findAll();
    public Provider findOne(Integer id);
    public Provider findByName(String nombre);
    public void delete(Provider provider);
    public void createOrUpdate(Provider provider);
}

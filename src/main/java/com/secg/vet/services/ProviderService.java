package com.secg.vet.services;

import com.secg.vet.domain.Proveedor;

import java.util.List;

public interface ProviderService {
    public List<Proveedor> findAll();
    public Proveedor findOne(Integer id);
}

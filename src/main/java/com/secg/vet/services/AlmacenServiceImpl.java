package com.secg.vet.services;

import com.secg.vet.domain.Almacen;
import com.secg.vet.repositories.AlmacenRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AlmacenServiceImpl implements AlmacenService {

    @Autowired
    AlmacenRepository almacenRepository;

    @Override
    public List<Almacen> listarProductos() {
        return almacenRepository.findAll();
    }

    @Override
    public Almacen listarProducto(Integer id) {
        return almacenRepository.getOne(id);
    }

}

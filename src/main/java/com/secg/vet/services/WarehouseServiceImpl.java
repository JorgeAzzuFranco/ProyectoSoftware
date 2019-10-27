package com.secg.vet.services;

import com.secg.vet.domain.Warehouse;
import com.secg.vet.repositories.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseServiceImpl implements WarehouseService {

    @Autowired
    WarehouseRepository warehouseRepository;

    @Override
    public List<Warehouse> listarProductos() {
        return warehouseRepository.findAll();
    }

    @Override
    public Warehouse listarProducto(Integer id) {
        return warehouseRepository.getOne(id);
    }

    @Override
    public void insertProduct(Warehouse warehouse) {
        warehouseRepository.save(warehouse);
    }

}

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
    public Warehouse listarProductoSku(String sku) {
        return warehouseRepository.findBySku(sku);
    }

    @Override
    public void insertProduct(Warehouse warehouse) {
        warehouseRepository.save(warehouse);
    }

    @Override
    public void deleteProduct(Warehouse warehouse) {
        warehouseRepository.delete(warehouse);
    }

}

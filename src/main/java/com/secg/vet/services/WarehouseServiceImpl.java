package com.secg.vet.services;

import com.secg.vet.domain.Warehouse;
import com.secg.vet.repositories.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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
    public Warehouse findOne(Integer id) {
        return warehouseRepository.getOne(id);
    }

    @Transactional
    @Override
    public void insertProduct(Warehouse warehouse) {
        warehouseRepository.save(warehouse);
    }

    @Transactional
    @Override
    public void deleteProduct(Warehouse warehouse) {
        warehouseRepository.delete(warehouse);
    }

}

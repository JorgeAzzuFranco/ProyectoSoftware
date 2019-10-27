package com.secg.vet.services;

import com.secg.vet.domain.Warehouse;

import java.util.List;

public interface WarehouseService {
    public List<Warehouse> listarProductos();
    public Warehouse listarProducto(Integer id);
    public void insertProduct(Warehouse warehouse);
}

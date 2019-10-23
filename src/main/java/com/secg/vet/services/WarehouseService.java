package com.secg.vet.services;

import com.secg.vet.domain.Warehouse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WarehouseService {
    public List<Warehouse> listarProductos();
    public Warehouse listarProducto(Integer id);
}

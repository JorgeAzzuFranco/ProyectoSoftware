package com.secg.vet.services;

import com.secg.vet.domain.Almacen;

import java.util.List;

public interface AlmacenService {
    public List<Almacen> listarProductos();
    public Almacen listarProducto(Integer id);
}

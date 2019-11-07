package com.secg.vet.repositories;

import com.secg.vet.domain.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehouseRepository extends JpaRepository<Warehouse,Integer> {
    public Warehouse findBySku(String sku);
}

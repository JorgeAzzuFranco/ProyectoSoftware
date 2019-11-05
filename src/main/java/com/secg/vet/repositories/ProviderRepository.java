package com.secg.vet.repositories;

import com.secg.vet.domain.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProviderRepository extends JpaRepository<Proveedor,Integer> {
}

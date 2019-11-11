package com.secg.vet.repositories;

import com.secg.vet.domain.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProviderRepository extends JpaRepository<Provider,Integer> {
    @Query(value= "SELECT * FROM proveedor WHERE nombre_proveedor= :nombre",nativeQuery = true)
    public Provider findByName(@Param("nombre") String nombre);
}

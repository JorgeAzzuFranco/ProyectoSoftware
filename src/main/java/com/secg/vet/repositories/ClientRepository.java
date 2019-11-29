package com.secg.vet.repositories;

import com.secg.vet.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client,Integer>{
    @Query(value = "SELECT * FROM CLIENT WHERE nombre = :name", nativeQuery = true)
    Client findByName(@Param("name") String name);

}

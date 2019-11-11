package com.secg.vet.repositories;

import com.secg.vet.domain.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<Pet, Integer> {
    @Query(value = "SELECT * FROM MASCOTA WHERE nombre = :name", nativeQuery = true)
    Pet findByName(@Param("name") String name);
}


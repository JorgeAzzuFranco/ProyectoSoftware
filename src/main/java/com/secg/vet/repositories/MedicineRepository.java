package com.secg.vet.repositories;

import com.secg.vet.domain.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Integer> {

    @Modifying
    @Transactional
    @Query(value="DELETE FROM medicina where mascxmed = :id and id = :medid", nativeQuery = true)
    public void deleteMedicineByIdAndMedicineId(@Param("id") Integer id, @Param("medid") Integer medicineId);

    @Query(value = "select * from medicina where nombre = :nombre", nativeQuery = true)
    public Medicine findByName(@Param("nombre") String nombre);
}

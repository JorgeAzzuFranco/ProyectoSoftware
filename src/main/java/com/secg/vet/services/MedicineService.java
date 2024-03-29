package com.secg.vet.services;

import com.secg.vet.domain.Medicine;

import java.util.List;

public interface MedicineService {

    public List<Medicine> findAll();
    public void addMedicine(Integer id, String medicine, Integer quantity, String dose);
    public void deleteMedicine(Integer id, Integer medicineId);
    public Medicine findByName(String name);
}

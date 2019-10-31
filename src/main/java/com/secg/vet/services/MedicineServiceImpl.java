package com.secg.vet.services;

import com.secg.vet.domain.Medicine;
import com.secg.vet.repositories.MedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineServiceImpl implements MedicineService {

    @Autowired
    MedicineRepository medicineRepository;

    @Override
    public List<Medicine> findAll() {
        return medicineRepository.findAll();
    }

    @Override
    public Medicine findOne(Integer id) {
        return medicineRepository.getOne(id);
    }

    @Override
    public void addMedicine(Integer id, String medicine, Integer quantity, String dose) {
        Medicine m = new Medicine(medicine, dose, quantity, id);
        medicineRepository.save(m);
    }


}

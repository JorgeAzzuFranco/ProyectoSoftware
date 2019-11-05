package com.secg.vet.test;

import com.secg.vet.domain.Medicine;
import com.secg.vet.repositories.MedicineRepository;
import com.secg.vet.services.MedicineService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MedicineTest {

    @Autowired
    MedicineRepository medicineRepository;
    @Autowired
    MedicineService medicineService;

    @Test
    public void getAllMedicineTest(){
        assertThat(medicineService.findAll()).isNotEmpty();
    }

    @Test
    public void getOneMedicineTest(){
        medicineService.addMedicine(1,"test1",20,"una vez al dia");
        assertThat(medicineService.findByName("test1")).isNotNull();
        Medicine medicine = medicineRepository.findByName("test1");
        Integer idMedicine = medicine.getId();
        medicineRepository.deleteMedicineByIdAndMedicineId(1,idMedicine);
    }

    @Test
    public void addMedicineTest(){
        medicineService.addMedicine(1,"test1",20,"una vez al dia");
        assertThat(medicineService.findByName("test1"));
        Medicine medicine = medicineRepository.findByName("test1");
        Integer idMedicine = medicine.getId();
        medicineRepository.deleteMedicineByIdAndMedicineId(1,idMedicine);
    }

    @Test
    public void deleteMedicineTest(){
        Medicine medicineTest = new Medicine("test1","una vez al dia", 20, 1);
        medicineRepository.save(medicineTest);
        Medicine medicine = medicineRepository.findByName("test1");
        Integer idMedicine = medicine.getId();
        medicineRepository.deleteMedicineByIdAndMedicineId(1,idMedicine);
        assertThat(medicineRepository.findByName("test1")).isNull();
    }

}

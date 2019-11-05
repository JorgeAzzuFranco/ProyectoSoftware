package com.secg.vet;

import com.secg.vet.controllers.Login2Controller;
import com.secg.vet.controllers.MedicineController;
import com.secg.vet.controllers.PetController;
import com.secg.vet.controllers.WarehouseController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VetWebAppApplicationTests {

    @Autowired
    MedicineController medicineController;
    @Autowired
    PetController petController;
    @Autowired
    WarehouseController warehouseController;
    @Autowired
    Login2Controller login2Controller;

	@Test
	public void contextLoads() {
	    assertThat(medicineController).isNotNull();
	    assertThat(petController).isNotNull();
	    assertThat(warehouseController).isNotNull();
	    assertThat(login2Controller).isNotNull();
	    //assertThat().isNotNull();
	}

}

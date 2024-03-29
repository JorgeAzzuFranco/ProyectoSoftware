package com.secg.vet;

import com.secg.vet.controllers.*;
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
    LoginController loginController;
    @Autowired
    RegisterController registerController;
    @Autowired
    ProviderController providerController;

	@Test
	public void contextLoads() {
	    assertThat(medicineController).isNotNull();
	    assertThat(petController).isNotNull();
	    assertThat(warehouseController).isNotNull();
	    assertThat(loginController).isNotNull();
	    assertThat(registerController).isNotNull();
	    assertThat(providerController).isNotNull();
	    //assertThat().isNotNull();
	}

}

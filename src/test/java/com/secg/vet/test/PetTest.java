package com.secg.vet.test;

import com.secg.vet.services.PetService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PetTest {

    @Autowired
    PetService petService;

    @Test
    public void findAllPetTest(){
     assertThat(petService.findAll()).isNotNull();
    }

    @Test
    public void findOnePetTest(){
        assertThat(petService.findOne(1)).isNotNull();
    }

}

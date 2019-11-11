package com.secg.vet.test;

import com.secg.vet.domain.Pet;
import com.secg.vet.services.PetService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;

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

    @Test
    public void findByNamePetTest() {
        Pet test = new Pet("test", "test", "test", Date.valueOf("2019-01-01"), 23.0);
        petService.addPet(test);
        assertThat(petService.findByName("test")).isNotNull();
        test = petService.findByName("test");
        petService.deletePet(test);
    }

    @Test
    public void deletePet() {
        Pet test = new Pet("test", "test", "test", Date.valueOf("2019-01-01"), 23.0);
        petService.addPet(test);
        test = petService.findByName("test");
        petService.deletePet(test);
        assertThat(petService.findByName("test")).isNull();
    }
}

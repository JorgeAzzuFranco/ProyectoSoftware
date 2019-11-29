package com.secg.vet.test;

import com.secg.vet.domain.Pet;
import com.secg.vet.services.ClientService;
import com.secg.vet.services.PetService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;
import java.util.Calendar;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PetTest {

    @Autowired
    PetService petService;
    @Autowired
    ClientService clientService;

    @Test
    public void findAllPetTest(){
     assertThat(petService.findAll()).isNotNull();
    }

    @Test
    public void findOnePetTest(){
        assertThat(petService.findOne(1)).isNotNull();
    }

    @Test
    public void addPet(){
        Pet pet = new Pet("test","test","test",0.0,null);
        petService.addPet(pet);
        assertThat(petService.findByName("test")).isNotNull();
        pet = petService.findByName("test");
        petService.deletePet(pet);
    }

    @Test
    public void deletePet(){
        Pet pet = new Pet("test","test","test",0.0,null);
        petService.addPet(pet);
        petService.deletePet(pet);
        assertThat(petService.findByName("test")).isNull();
    }

    

}

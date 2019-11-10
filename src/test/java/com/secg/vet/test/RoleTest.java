package com.secg.vet.test;

import com.secg.vet.services.RolService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleTest {
    @Autowired
    RolService rolService;

    @Test
    public void getAllRoles(){
        assertThat(rolService.findAll()).isNotEmpty();
    }
}

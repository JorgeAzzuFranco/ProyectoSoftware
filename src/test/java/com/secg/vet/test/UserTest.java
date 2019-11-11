package com.secg.vet.test;

import com.secg.vet.domain.Rol;
import com.secg.vet.domain.User;
import com.secg.vet.services.UserService;
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
    @Autowired
    UserService userService;
    @Autowired
    BCryptPasswordEncoder encoder;

    @Test
    public void findAllUsers(){
        assertThat(userService.findAll()).isNotEmpty();
    }

    @Test
    public void getUsernameByName(){
        User user = new User();
        user.setName("Test");
        user.setLast_name("Test");
        user.setEmail("Test");
        user.setUsername("Test");
        user.setPassword(encoder.encode("Test"));
        Rol rol = new Rol();
        rol.setPk_role(1);
        user.setRol(rol);
        userService.updateOrCreate(user);
        AssertionsForClassTypes.assertThat(userService.findOneByUsername("Test")).isNotNull();
        userService.delete(userService.findOneByUsername("Test"));
    }

    @Test
    public void updateExistingUser(){
        User user = new User();
        user.setName("Test");
        user.setLast_name("Test");
        user.setEmail("Test");
        user.setUsername("Test");
        user.setPassword(encoder.encode("Test"));
        Rol rol = new Rol();
        rol.setPk_role(1);
        user.setRol(rol);
        userService.updateOrCreate(user);
        User existingUser = userService.findOneByUsername("Test");
        existingUser.setUsername("TestExist");
        userService.updateOrCreate(existingUser);
        AssertionsForClassTypes.assertThat(userService.findOneByUsername("TestExist")).isNotNull();
        userService.delete((userService.findOneByUsername("TestExist")));
    }

    @Test
    public void createUser(){
        User user = new User();
        user.setName("Test");
        user.setLast_name("Test");
        user.setEmail("Test");
        user.setUsername("Test");
        user.setPassword(encoder.encode("Test"));
        Rol rol = new Rol();
        rol.setPk_role(1);
        user.setRol(rol);
        userService.updateOrCreate(user);
        AssertionsForClassTypes.assertThat(userService.findOneByUsername("Test")).isNotNull();
        userService.delete(userService.findOneByUsername("Test"));
    }

    @Test
    public void verifyIfUserExists(){
        User user = new User();
        user.setName("Test");
        user.setLast_name("Test");
        user.setEmail("Test");
        user.setUsername("Test");
        user.setPassword(encoder.encode("Test"));
        Rol rol = new Rol();
        rol.setPk_role(1);
        user.setRol(rol);
        userService.updateOrCreate(user);
        assertThat(userService.userExists(user)).isTrue();
        userService.delete(userService.findOneByUsername("Test"));
    }

    @Test
    public void deleteUser(){
        User user = new User();
        user.setName("Test");
        user.setLast_name("Test");
        user.setEmail("Test");
        user.setUsername("Test");
        user.setPassword(encoder.encode("Test"));
        Rol rol = new Rol();
        rol.setPk_role(1);
        user.setRol(rol);
        userService.updateOrCreate(user);
        AssertionsForClassTypes.assertThat(userService.findOneByUsername("Test")).isNotNull();
        userService.delete(userService.findOneByUsername("Test"));
    }

}


package com.secg.vet.test;


import com.secg.vet.domain.Client;
import com.secg.vet.repositories.ClientRepository;
import com.secg.vet.services.ClientService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClientTest {
    @Autowired
    ClientRepository clientRepository;

    @Autowired
    ClientService clientService;

    @Test
    public void getAllClients(){assertThat(clientService.findAll()).isNotEmpty();}

    @Test
    public void getOneClient(){
        Client cliente = new Client("Prueba","Prueba",1);
        clientService.addClient(cliente);
        assertThat(clientService.findByName("Prueba")).isNotNull();
        cliente = clientService.findByName("Prueba");
        assertThat(clientService.findOne(cliente.getPk_client())).isNotNull();
        clientService.deleteClient(cliente);
    }

    @Test
    public void addClient(){
        Client cliente = new Client("Prueba","Prueba",1);
        clientService.addClient(cliente);
        assertThat(clientService.findByName("Prueba")).isNotNull();
        cliente = clientService.findByName("Prueba");
        clientService.deleteClient(cliente);
    }

    @Test
    public void searchClientByName(){
        Client cliente = new Client("Prueba","Prueba",1);
        clientService.addClient(cliente);
        assertThat(clientService.findByName("Prueba")).isNotNull();
        cliente = clientService.findByName("Prueba");
        clientService.deleteClient(cliente);
    }

    @Test
    public void deleteClient(){
        Client cliente = new Client("Prueba","Prueba",1);
        clientService.addClient(cliente);
        cliente = clientService.findByName("Prueba");
        clientService.deleteClient(cliente);
        assertThat(clientService.findByName("Prueba")).isNull();
    }

}

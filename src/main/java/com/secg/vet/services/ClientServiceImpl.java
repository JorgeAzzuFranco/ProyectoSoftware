package com.secg.vet.services;

import com.secg.vet.domain.Client;
import com.secg.vet.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class ClientServiceImpl implements ClientService {


    @Autowired
    ClientRepository clientRepository;

    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client findOne(Integer id) {
        return clientRepository.getOne(id);
    }

    @Transactional
    @Override
    public void addClient(Client cliente) {
        clientRepository.save(cliente);
    }

    @Override
    public Client findByName(String name) {
        return clientRepository.findByName(name);
    }

    @Transactional
    @Override
    public void deleteClient(Client cliente) {
        clientRepository.delete(cliente);
    }

}

package com.secg.vet.services;

import com.secg.vet.domain.Client;

import java.util.List;

public interface ClientService {
    public List<Client> findAll();
    public Client findOne(Integer id);
    public void addClient(Client cliente);
    public Client findByName(String name);
    public void deleteClient(Client cliente);
}

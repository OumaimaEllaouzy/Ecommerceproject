package com.example.projetecommerce2.services;

import com.example.projetecommerce2.entities.Client;
import com.example.projetecommerce2.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClientServiceimp implements ClientService{

    private ClientRepository clientRepository;

    @Autowired
    public ClientServiceimp(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client updateClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void deleteClientById(Long id) {
        clientRepository.deleteById(id);   }

    @Override
    public void deleteClient() {

    }

    @Override
    public void deleteAllClients() {
        clientRepository.deleteAll();
    }

    @Override
    public Client getClientById(Long id) {
        return clientRepository.findById(id).get();
    }

    @Override
    public List<Client> getAllClient() {
        return null;
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
}
package com.example.projetecommerce2.services;

import com.example.projetecommerce2.entities.Client;
import com.example.projetecommerce2.repositories.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor

public class ClientServiceImpl implements ClientService {
    private ClientRepository clientRepository;
    @Override
    public Client saveClient(Client client) {
        return null;
    }

    @Override
    public Client updateClient(Client client) {
        return null;
    }

    @Override
    public void deleteClientById(Long id) {

    }

    @Override
    public void deleteClient() {

    }

    @Override
    public Client getClientById(Long id) {
        return null;
    }

    @Override
    public List<Client> getAllClient() {
        return null;
    }
}

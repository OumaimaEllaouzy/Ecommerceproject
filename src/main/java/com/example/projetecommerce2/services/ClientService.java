package com.example.projetecommerce2.services;
import com.example.projetecommerce2.entities.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClientService {
    Client saveClient(Client client);
    Client updateClient(Client client);
    void deleteClientById(Long id);
    void deleteClient();
    Client getClientById(Long id);
    List<Client> getAllClient();
}

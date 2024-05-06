package com.example.projetecommerce2.controllers;


import com.example.projetecommerce2.entities.Client;
import com.example.projetecommerce2.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class
ClientController {
    @Autowired
    private ClientService clientService;

    @PostMapping()
    public String add(@RequestBody Client client){
        clientService.saveClient(client);
        return "New  added";
    }
    @GetMapping
    public List<Client> getAllClients(){
        return clientService.getAllClient();
    }
    @GetMapping("/get/{id}")
    public Client getClientById(@PathVariable Long id) {
        return clientService.getClientById(id);
    }
    @PutMapping("/update/{id}")
    public Client update(@PathVariable Long id, @RequestBody Client updatedClient) {
        return  clientService.updateClient(id, updatedClient);
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        clientService.deleteClientById(id);
        return "Client deleted successfully";
    }
}
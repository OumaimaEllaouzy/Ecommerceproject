package com.example.projetecommerce2.controllers;
import com.example.projetecommerce2.entities.Client;
import com.example.projetecommerce2.services.ClientServiceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class
ClientController {
    @Autowired
    private ClientServiceimp clientService;

    @PostMapping()
    public String add(@RequestBody Client client){
        clientService.saveClient(client);
        return "New  added";
    }
    @GetMapping
    public List<Client> getAllClients(){
        return clientService.getAllClients();
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
        clientService.getClientById(id);
        return "Client deleted successfully";
    }
}
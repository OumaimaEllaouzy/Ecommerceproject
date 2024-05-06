package com.example.projetecommerce2.services;

import com.example.projetecommerce2.entities.Client;
import com.example.projetecommerce2.entities.Paiement;

import java.util.List;

public interface PaiementService {
    Paiement savePaiement(Paiement paiement);
    Paiement updatePaiement(Paiement paiement);
    void deletePaiementtById(Long id);
    void deletePaiement();

    void deletePaiementById(Long id);

    void deleteAllPaiement();

    Paiement getPaiementById(Long id);
    List<Paiement> getAllPaiement();

    List<Paiement> getAllCPaiement();

    List<Client> getAllCPaiements();
}

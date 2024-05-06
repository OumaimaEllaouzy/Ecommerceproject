package com.example.projetecommerce2.services;
import com.example.projetecommerce2.entities.Commande;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CommandeService {
    Commande saveCommande(Commande commande);
    Commande updateCommande(Commande commande);
    void deleteCommandeById(Long id);
    void deleteCommande();

    void deleteAllCommande();

    Commande getCommandeById(Long id);
    List<Commande> getAllCommande();

    void deleteAllCommandes();

    Commande getById(Long id);

    List<Commande> getAllCommandes();
}

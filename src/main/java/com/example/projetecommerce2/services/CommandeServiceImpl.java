package com.example.projetecommerce2.services;
import com.example.projetecommerce2.entities.Commande;
import com.example.projetecommerce2.repositories.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommandeServiceImpl implements CommandeService {

    private CommandeRepository commandeSRepository;

    @Autowired
    public CommandeServiceImpl (CommandeRepository commandeRepository) {
        this.commandeSRepository = commandeRepository;
    }

    @Override
    public Commande saveCommande(Commande commande) {
        return commandeSRepository.save(commande);
    }

    @Override
    public Commande updateCommande(Commande commande) {
        return commandeSRepository.save(commande);
    }


    @Override
    public void deleteCommandeById(Long id) {
        commandeSRepository.deleteById(id);   }

    @Override
    public void deleteCommande() {

    }

    @Override
    public void deleteAllCommande() {

    }

    @Override
    public Commande getCommandeById(Long id) {
        return null;
    }

    @Override
    public List<Commande> getAllCommande() {
        return null;
    }


    @Override
    public void deleteAllCommandes() {
        commandeSRepository.deleteAll();
    }

    @Override
    public Commande getById(Long id) {
        return commandeSRepository.getById(id);
    }


    @Override
    public List<Commande> getAllCommandes() {
        return commandeSRepository.findAll();
    }
}

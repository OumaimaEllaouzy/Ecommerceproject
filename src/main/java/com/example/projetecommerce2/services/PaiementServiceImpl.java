package com.example.projetecommerce2.services;
import com.example.projetecommerce2.entities.Client;
import com.example.projetecommerce2.entities.Paiement;
import com.example.projetecommerce2.repositories.PaiementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PaiementServiceImpl implements PaiementService{

    private PaiementRepository paiementRepository;

    @Autowired
    public PaiementServiceImpl (PaiementRepository paiementRepository) {
        this.paiementRepository = paiementRepository;
    }

    @Override
    public Paiement savePaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }


    @Override
    public Paiement updatePaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public void deletePaiementtById(Long id) {

    }

    @Override
    public void deletePaiement() {

    }


    @Override
    public void deletePaiementById(Long id) {
        paiementRepository.deleteById(id);   }


    @Override
    public void deleteAllPaiement() {
        paiementRepository.deleteAll();
    }

    @Override
    public Paiement getPaiementById(Long id) {
        return paiementRepository.findById(id).get();
    }


    @Override
    public List<Paiement> getAllPaiement() {
        return paiementRepository.findAll();
    }

    @Override
    public List<Client> getAllCPaiements() {
        return null;
    }

}

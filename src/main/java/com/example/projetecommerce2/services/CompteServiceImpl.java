package com.example.projetecommerce2.services;
import com.example.projetecommerce2.entities.Compte;
import com.example.projetecommerce2.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CompteServiceImpl {

    private CompteRepository compteRepository;

    @Autowired
    public void CompteServiceimp(CompteRepository clientRepository) {
        this.compteRepository = clientRepository;
    }

    @Override
    public Compte saveCompte(Compte compte) {
        return compteRepository.save(compte);
    }

    @Override
    public Compte updateCompte(Compte compte) {
        return compteRepository.save(compte);
    }

    @Override
    public void deleteCompteById(Long id) {
        compteRepository.deleteById(id);   }

    @Override
    public void deleteCompte() {

    }

    @Override
    public void deleteAllComptes() {
        compteRepository.deleteAll();
    }

    @Override
    public Compte getCompteById(Long id) {
        return compteRepository.findById(id).get();
    }

    @Override
    public List<Compte> getAllCompte) {
        return null;
    }

    @Override
    public List<Compte> getAllComptes() {
        return compteRepository.findAll();
    }
}

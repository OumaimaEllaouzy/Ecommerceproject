package com.example.projetecommerce2.services;
import com.example.projetecommerce2.entities.Compte;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CompteService {
    Compte saveCompte(Compte compte);
    Compte updateCommande(Compte compte);
    void deleteCompteById(Long id);
    void deleteCompte();

    void deleteAllCompte();

    Compte getCompteById(Long id);
    List<Compte> getAllCompte();

    void deleteAllComptes();

    Compte getById(Long id);

    List<Compte> getAllComptes();

}

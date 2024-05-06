package com.example.projetecommerce2.services;
import com.example.projetecommerce2.entities.Livreur;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface LivreurService {
    Livreur saveLivreur(Livreur livreur);

    Livreur save(Livreur livreur);

    Livreur updateLivreur(Livreur livreur);
    void deleteLivreurById(Long id);
    void deleteLivreur();

    void deleteAllLivreur();

    Livreur updateLivreurt(Livreur livreur);

    Livreur getLivreurById(Long id);
    List<Livreur> getAllLivreur();

    List<Livreur> getAllLivreurs();




}

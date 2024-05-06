package com.example.projetecommerce2.services;
import com.example.projetecommerce2.entities.Produit;
import org.springframework.stereotype.Service;


import java.util.List;
  @Service
    public interface ProduitService {


        Produit saveProduit(Produit produit);
        Produit updateProduit(Produit produit);
        void deleteProduitById(Long id);
        void deleteAllProduits();
        Produit getProduitById(Long id);
        List<Produit> getAllProduits();
    }

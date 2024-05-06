package com.example.projetecommerce2.services;

import com.example.projetecommerce2.entities.Client;
import com.example.projetecommerce2.entities.Produit;
import com.example.projetecommerce2.repositories.ClientRepository;
import com.example.projetecommerce2.repositories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


    @Service
    public class ProduitServiceImpl implements ProduitService{


        private ProduitRepository produitRepository;

        @Autowired
        public ProduitServiceImpl (ProduitRepository produitRepository) {
            this.produitRepository = produitRepository;
        }

        @Override
        public Produit saveProduit(Produit produit) {
            return produitRepository.save(produit);
        }


        @Override
        public Produit updateProduit(Produit produit) {
            return produitRepository.save(produit);
        }


        @Override
        public void deleteProduitById(Long id) {
            produitRepository.deleteById(id);   }


        @Override
        public void deleteAllProduits() {
            produitRepository.deleteAll();
        }

        @Override
        public Produit getProduitById(Long id) {
            return produitRepository.findById(id).get();
        }


        @Override
        public List<Produit> getAllProduits() {
            return produitRepository.findAll();
        }
    }

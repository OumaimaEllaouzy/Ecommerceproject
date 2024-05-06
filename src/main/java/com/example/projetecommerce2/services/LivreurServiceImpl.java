package com.example.projetecommerce2.services;

import com.example.projetecommerce2.entities.Livreur;
import com.example.projetecommerce2.repositories.LivreurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class LivreurServiceImpl implements LivreurService{

    private LivreurRepository livreurRepository;

    @Autowired
    public LivreurServiceImpl (LivreurRepository livreurRepository) {
        this.livreurRepository = livreurRepository;
    }

    @Override
    public Livreur save(Livreur livreur) {
        return null;
    }

    @Override
    public Livreur updateLivreur(Livreur livreur) {
        return null;
    }

    @Override
    public Livreur saveLivreur(Livreur livreur) {
        return livreurRepository.save(livreur);
    }


    @Override
    public Livreur updateLivreurt(Livreur livreur) {
        return livreurRepository.save(livreur);
    }


    @Override
    public Livreur getLivreurById(Long id) {
        return null;
    }

    @Override
    public List<Livreur> getAllLivreurs() {
        return null;
    }


    @Override
    public void deleteLivreur() {

    }


    @Override
    public void deleteLivreurById(Long id) {
        livreurRepository.deleteById(id);   }


    @Override
    public void deleteAllLivreur() {
        livreurRepository.deleteAll();
    }

    @Override
    public List<Livreur> getAllLivreur() {
        return livreurRepository.findAll();
    }


    }

package com.example.projetecommerce2.services;

import com.example.projetecommerce2.entities.Categorie;
import com.example.projetecommerce2.repositories.CategorieRepository;
import jdk.jfr.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategorieServiceimpl implements CategorieService{

    private final CategorieRepository CategorieRepository;
    private CategorieRepository categorieRepository;

    @Autowired
    public CategorieServiceimpl(CategorieRepository categorieRepository) {
        this.CategorieRepository = categorieRepository;
    }

    @Override
    public Categorie saveCategorie(Categorie categorie) {
        return (Categorie) CategorieRepository.save(categorie);
    }

    @Override
    public Categorie updateCategorie(Categorie categorie) {
        return null;
    }

    public Category updateCash(Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    @Override
    public void deleteCategorieById(Long id) {
        categorieRepository.deleteById(id);   }

    @Override
    public void deleteCategorie() {

    }

    @Override
    public void deleteAllCategorie() {

    }

    @Override
    public Categorie getCategorieById(Long id) {
        return null;
    }

    @Override
    public void deleteAllCategorie() {
        categorieRepository.deleteAll();
    }

    @Override
    public Categorie getCategorieById(Long id) {
        return (Categorie) CategorieRepository.findById(id).get();
    }

    @Override
    public List<Categorie> getAllCategorie() {
        return null;
    }

    @Override
    public List<Category> getAllCategories() {
        return CategorieRepository.findAll();
    }
}

package com.example.projetecommerce2.services;

import com.example.projetecommerce2.entities.Categorie;
import jdk.jfr.Category;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CategorieService {

    Categorie saveCategorie( Categorie categorie);
    Categorie updateCategorie(Categorie categorie );
    void deleteCategorieById(Long id);
    void deleteCategorie();

    void deleteAllCategorie();

    Categorie getCategorieById(Long id);
    List<Categorie> getAllCategorie();

    List<Category> getAllCategories();
}

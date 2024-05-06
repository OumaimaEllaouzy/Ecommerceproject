package com.example.projetecommerce2.repositories;

import com.example.projetecommerce2.entities.Categorie;
import jdk.jfr.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepository extends JpaRepository<Category,Long> {
    Category save(Categorie categorie);
}

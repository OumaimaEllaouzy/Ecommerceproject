package com.example.projetecommerce2.repositories;

import com.example.projetecommerce2.entities.Livreur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivreurRepository extends JpaRepository<Livreur,Long> {
}

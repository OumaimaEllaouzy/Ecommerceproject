package com.example.projetecommerce2.repositories;

import com.example.projetecommerce2.entities.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaiementRepository extends JpaRepository<Paiement,Long> {
}

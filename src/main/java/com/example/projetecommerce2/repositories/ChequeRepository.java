package com.example.projetecommerce2.repositories;

import com.example.projetecommerce2.entities.Cheque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChequeRepository extends JpaRepository<Cheque,Long> {
}

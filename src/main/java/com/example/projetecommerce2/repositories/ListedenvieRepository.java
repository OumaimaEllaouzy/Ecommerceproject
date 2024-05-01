package com.example.projetecommerce2.repositories;

import com.example.projetecommerce2.entities.Listedenvie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListedenvieRepository extends JpaRepository<Listedenvie,Long> {
}

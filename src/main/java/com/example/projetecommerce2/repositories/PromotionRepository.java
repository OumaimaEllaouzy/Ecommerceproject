package com.example.projetecommerce2.repositories;

import com.example.projetecommerce2.entities.Client;
import com.example.projetecommerce2.entities.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromotionRepository extends JpaRepository<Promotion,Long>
{
}

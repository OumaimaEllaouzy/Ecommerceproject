package com.example.projetecommerce2.repositories;

import com.example.projetecommerce2.entities.Cash;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CashRepository extends JpaRepository <Cash,Long>  {
}

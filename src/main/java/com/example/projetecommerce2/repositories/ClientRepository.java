package com.example.projetecommerce2.repositories;

import com.example.projetecommerce2.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {

}

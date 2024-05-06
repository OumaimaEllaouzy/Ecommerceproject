package com.example.projetecommerce2.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Promotion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idpromo;
    private Date date_debut;
    private Date date_Fin;
    private int Codepromos;
    private Boolean status;
    @OneToMany(mappedBy ="Promotion" )
    private List<Produit> Produits;
}



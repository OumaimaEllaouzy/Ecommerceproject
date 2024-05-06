package com.example.projetecommerce2.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Date datedecommande;
    private int idcom;
    private float total;
    @ManyToOne
    private Client client;
    @ManyToMany
    @JoinTable(
            name ="produit_commandes",
            joinColumns = @JoinColumn(name="commande_id"),
            inverseJoinColumns = @JoinColumn(name = "produit_id")
    )
    private List<Produit> produits=new ArrayList<>();

}

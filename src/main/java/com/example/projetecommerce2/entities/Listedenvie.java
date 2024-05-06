package com.example.projetecommerce2.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Listedenvie
{ @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToMany
    @JoinTable(
            name ="Listedenvie_commandes",
            joinColumns = @JoinColumn(name="Listedenvie_id"),
            inverseJoinColumns = @JoinColumn(name = "produit_id")
    )
            private List<Produit> produits=new ArrayList<>();

}


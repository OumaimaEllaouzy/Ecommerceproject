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
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Date date_creation;
    private String mot_de_passe;
    private String login;
    @OneToOne
    @JoinColumn(name = "client_id",referencedColumnName ="id")
    private Client client;
    @OneToOne
    @JoinColumn(name = "Listedenvie_id",referencedColumnName ="id")
    private Listedenvie listedenvie;

}

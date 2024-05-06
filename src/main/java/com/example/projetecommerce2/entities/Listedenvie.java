package com.example.projetecommerce2.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Listedenvie
{ @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
}


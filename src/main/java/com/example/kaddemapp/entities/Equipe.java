package com.example.kaddemapp.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Equipe")
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_equipe",nullable = false)
    private Integer idEquipe;
    @Column(name = "nom_equipe",nullable = false)
    private String nomEquipe;
    @Enumerated(EnumType.STRING)
    private Niveau niveau;
}

package com.example.kaddemapp.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_etudiant", nullable = false)
    private Long idEtudiant;

    @Column(name = "nom_etudiant")
    private String nomEtudiant;

    @Column(name = "prenom_etudiant")
    private String prenomEtudiant;

    @Enumerated(EnumType.STRING)
    private Option option;


}

package com.example.kaddemapp.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_etudiant", nullable = false)
    private Integer idEtudiant;

    @Column(name = "nom_etudiant")
    private String nomEtudiant;

    @Column(name = "prenom_etudiant")
    private String prenomEtudiant;

    @Enumerated(EnumType.STRING)
    private Option option;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "etudiant")
    private Set<Contrat> contrats;

    @ManyToOne
    private Department department;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "etudiants")
    private Set<Equipe> equipes;

}

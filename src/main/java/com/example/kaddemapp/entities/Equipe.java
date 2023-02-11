package com.example.kaddemapp.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "Equipe")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_equipe",nullable = false)
    private Integer idEquipe;
    @Column(name = "nom_equipe",nullable = false)
    private String nomEquipe;
    @Enumerated(EnumType.STRING)
    private Niveau niveau;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;
    @OneToOne
    private DetailEquipe detailEquipe;
}

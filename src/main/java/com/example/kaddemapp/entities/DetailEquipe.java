package com.example.kaddemapp.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "DetailEquipe")
public class DetailEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detail_equipe",nullable = false)
    private Integer idDetailEquipe;
    private Integer salle;
    private String thematique;

    @OneToOne(mappedBy = "detailEquipe")
    private Equipe equipe;
}
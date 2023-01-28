package com.example.kaddemapp.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Universite")
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id_universite",nullable = false)
    private Integer idUniversite;
    @Column(name = "nom_universite",nullable = false)
    private String nomUniversite;
}
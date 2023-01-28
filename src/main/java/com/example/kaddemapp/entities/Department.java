package com.example.kaddemapp.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Department")
public class Department implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_depart",nullable = false)
    private Integer idDepartment ;
    @Column(name = "nom_department",nullable = false)
    private String nomDepartment;
}
package com.example.kaddemapp.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "Universite")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id_universite",nullable = false)
    private Integer idUniversite;
    @Column(name = "nom_universite",nullable = false)
    private String nomUniversite;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Department> departments;
}
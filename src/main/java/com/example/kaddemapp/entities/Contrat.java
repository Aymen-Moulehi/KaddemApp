package com.example.kaddemapp.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Contrat")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contrat",nullable = false)
    private Integer idContrat;
    @Temporal(TemporalType.DATE)
    @Column(name = "date_debut_contrat",nullable = false)
    private Date dateDebtutContrat;
    @Temporal(TemporalType.DATE)
    @Column(name = "date_fin_contrat",nullable = false)
    private Date dateFinContrat;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    private Boolean archive;
    @Column(name = "nontant_contart",nullable = false)
    private Integer montantContrat;

    @ManyToOne
    Etudiant etudiant;

}

package com.example.kaddemapp.services;

import com.example.kaddemapp.entities.Etudiant;

public interface IEtudiantService {
    Etudiant addEtudiant(Etudiant etudiant);
    Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat,
                                                     Integer idEquipe);
}

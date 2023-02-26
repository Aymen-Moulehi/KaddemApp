package com.example.kaddemapp.repositories;

import com.example.kaddemapp.entities.Etudiant;
import com.example.kaddemapp.entities.Niveau;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {
    // Récupérer les étudiants d’un département donné
    List<Etudiant> findEtudiantByDepartmentIdDepartment(Integer departmentId);

    Etudiant findEtudiantByIdEtudiant(Integer idEtudiant);

    //Récupérer les étudiants d_Niveau_Expertont l’équipe a un niveau SENIOR
    List<Etudiant> findByEquipesNiveau(Niveau niveau);

}

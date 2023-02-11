package com.example.kaddemapp.repositories;

import com.example.kaddemapp.entities.Etudiant;
import com.example.kaddemapp.entities.Niveau;
import com.example.kaddemapp.entities.Specialite;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {
    // Récupérer les étudiants d’un département donné
    List<Etudiant> findEtudiantByDepartment_IdDepartment(Integer departmentId);

    //Récupérer les étudiants dont l’équipe a un niveau SENIOR
    List<Etudiant> findByEquipes_Niveau_Expert();
}

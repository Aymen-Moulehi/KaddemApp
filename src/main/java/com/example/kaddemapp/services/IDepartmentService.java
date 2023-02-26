package com.example.kaddemapp.services;

import com.example.kaddemapp.entities.Equipe;
import org.springframework.data.repository.query.Param;

public interface IDepartmentService {
    void asignEtudiantADepartment(Integer idDepartement, Integer idEtudiant);
}

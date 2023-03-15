package com.example.kaddemapp.services;

import com.example.kaddemapp.entities.Department;
import com.example.kaddemapp.entities.Equipe;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Set;

public interface IDepartmentService {
    void asignEtudiantADepartment(Integer idDepartement, Integer idEtudiant);
    Set<Department> retrieveDepartementsByUniversite(Integer idUniversite);
}

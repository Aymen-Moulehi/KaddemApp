package com.example.kaddemapp.services;

import com.example.kaddemapp.entities.Department;
import com.example.kaddemapp.entities.Etudiant;
import com.example.kaddemapp.entities.Universite;
import com.example.kaddemapp.repositories.DepartmentRepository;
import com.example.kaddemapp.repositories.EtudiantRepository;
import com.example.kaddemapp.repositories.UniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements IDepartmentService{

    EtudiantRepository etudiantRepository;
    DepartmentRepository departmentRepository;

    UniversiteRepository universiteRepository;
    @Override
    public void asignEtudiantADepartment(Integer idDepartement, Integer idEtudiant) {
        Department department = departmentRepository.findDepartmentByIdDepartment(idDepartement);
        Etudiant etudiant = etudiantRepository.findEtudiantByIdEtudiant(idEtudiant);
        if(department != null && etudiant != null){
            etudiant.setDepartment(department);
            etudiantRepository.save(etudiant);
        }

    }

    @Override
    public Set<Department> retrieveDepartementsByUniversite(Integer idUniversite) {
        Universite universite = universiteRepository.findByIdUniversite(idUniversite);
        if(universite == null)
            return null;

        return universite.getDepartments();
    }
}

package com.example.kaddemapp.services;

import com.example.kaddemapp.entities.Department;
import com.example.kaddemapp.entities.Equipe;
import com.example.kaddemapp.entities.Etudiant;
import com.example.kaddemapp.repositories.DepartmentRepository;
import com.example.kaddemapp.repositories.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements IDepartmentService{

    EtudiantRepository etudiantRepository;
    DepartmentRepository departmentRepository;
    @Override
    public void asignEtudiantADepartment(Integer idDepartement, Integer idEtudiant) {
        Department department = departmentRepository.findDepartmentByIdDepartment(idDepartement);
        Etudiant etudiant = etudiantRepository.findEtudiantByIdEtudiant(idEtudiant);
        if(department != null && etudiant != null){
            etudiant.setDepartment(department);
            etudiantRepository.save(etudiant);
        }

    }
}

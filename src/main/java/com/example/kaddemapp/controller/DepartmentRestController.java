package com.example.kaddemapp.controller;

import com.example.kaddemapp.entities.Department;
import com.example.kaddemapp.entities.Equipe;
import com.example.kaddemapp.repositories.DepartmentRepository;
import com.example.kaddemapp.services.IDepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/department")
public class DepartmentRestController {

    IDepartmentService departmentService;
    private final DepartmentRepository departmentRepository;

    @PutMapping("/asign-etudiant/{idDepartement}/to-department/{idEtudiant}")
    public void asignEtudiantADepartment(
            @PathVariable("idDepartement") Integer idDepartement,
            @PathVariable("idEtudiant") Integer idEtudiant
    ){
        departmentService.asignEtudiantADepartment(idDepartement, idEtudiant);
    }
    @PostMapping("/add-departement")
    public Department addDepartment(@RequestBody Department department){
        return departmentRepository.save(department);
    }
}

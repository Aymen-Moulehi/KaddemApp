package com.example.kaddemapp.controller;

import com.example.kaddemapp.entities.Etudiant;
import com.example.kaddemapp.entities.Universite;
import com.example.kaddemapp.services.IEtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantRestController {
    IEtudiantService etudiantService;
    @PostMapping("/add-etudiant")
    public Etudiant addUniversite(@RequestBody Etudiant etudiant){
        return etudiantService.addEtudiant(etudiant);
    }

    @PostMapping("/asgin-etudiant-contrat-equipe/{idContrat}/{idEquipe}")
    public Etudiant addAndAssignEtudiantToEquipeAndContract(
            @RequestBody Etudiant etudiant,
            @PathVariable("idContrat") Integer idContrat,
            @PathVariable("idEquipe")  Integer idEquipe
            ){
        return etudiantService.addAndAssignEtudiantToEquipeAndContract(etudiant, idContrat, idEquipe);
    }
}

package com.example.kaddemapp.controller;

import com.example.kaddemapp.entities.Etudiant;
import com.example.kaddemapp.entities.Universite;
import com.example.kaddemapp.services.IEtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantRestController {
    IEtudiantService etudiantService;
    @PostMapping("/add-etudiant")
    public Etudiant addUniversite(@RequestBody Etudiant etudiant){
        return etudiantService.addEtudiant(etudiant);
    }
}

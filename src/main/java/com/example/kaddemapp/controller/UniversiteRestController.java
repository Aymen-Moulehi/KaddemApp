package com.example.kaddemapp.controller;

import com.example.kaddemapp.entities.Universite;
import com.example.kaddemapp.services.IUniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@AllArgsConstructor
@RequestMapping("/universite")
public class UniversiteRestController {

    IUniversiteService universiteService;
    @PostMapping("/add-universite")
    public Universite addUniversite(@RequestBody Universite universite){
        return universiteService.addUniversite(universite);
    }



    @GetMapping("get-chiffre-affaire-entre-startDate={startDate}&endDate={endDate}")
    public float getChiffreAffaireEntreDeuxDate(Date startDate, Date endDate){
        return 0.0f;
    }
}

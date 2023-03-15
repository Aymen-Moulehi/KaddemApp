package com.example.kaddemapp.services;

import com.example.kaddemapp.entities.Contrat;
import com.example.kaddemapp.entities.Universite;
import com.example.kaddemapp.repositories.ContratRepository;
import com.example.kaddemapp.repositories.UniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

@AllArgsConstructor
@Service
public class UniversiteServiceImpl implements IUniversiteService{
    
    UniversiteRepository universiteRepository;
    ContratRepository contratRepository;
    @Override
    public Universite addUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public float getChiffreAffaireEntreDeuxDate(Date startDate, Date endDate) {
        return 0;
    }
}

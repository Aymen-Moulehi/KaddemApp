package com.example.kaddemapp.services;

import com.example.kaddemapp.entities.Universite;
import com.example.kaddemapp.repositories.UniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UniversiteServiceImpl implements IUniversiteService{
    
    UniversiteRepository universiteRepository;
    @Override
    public Universite addUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }
}

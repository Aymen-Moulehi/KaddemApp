package com.example.kaddemapp.services;

import com.example.kaddemapp.entities.Universite;

import java.util.Date;

public interface IUniversiteService {
    Universite addUniversite(Universite universite);
    float getChiffreAffaireEntreDeuxDate(Date startDate, Date endDate);
}

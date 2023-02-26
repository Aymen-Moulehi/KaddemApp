package com.example.kaddemapp.repositories;

import com.example.kaddemapp.entities.Equipe;
import com.example.kaddemapp.entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversiteRepository extends JpaRepository<Universite,Integer> {
}

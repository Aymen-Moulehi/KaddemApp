package com.example.kaddemapp.repositories;

import com.example.kaddemapp.entities.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EquipeRepository extends JpaRepository<Equipe,Integer> {
}

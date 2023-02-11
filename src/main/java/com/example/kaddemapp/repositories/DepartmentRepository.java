package com.example.kaddemapp.repositories;

import com.example.kaddemapp.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}

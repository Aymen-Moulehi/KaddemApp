package com.example.kaddemapp.repositories;

import com.example.kaddemapp.entities.Contrat;
import com.example.kaddemapp.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {
    Department findDepartmentByIdDepartment(Integer idDepartment);

}

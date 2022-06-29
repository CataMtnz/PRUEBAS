package com.empresa.empresa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empresa.empresa.models.Empleado;

@Repository
public interface EmpleadoRepository extends JpaRepository <Empleado,Integer> {
    
}

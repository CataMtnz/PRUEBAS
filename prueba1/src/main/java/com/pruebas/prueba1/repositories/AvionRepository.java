package com.pruebas.prueba1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pruebas.prueba1.models.Avion;

@Repository
public interface AvionRepository extends JpaRepository<Avion, Long>{
}

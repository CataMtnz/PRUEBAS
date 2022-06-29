package com.empresa.empresa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empresa.empresa.models.Cliente;

@Repository                                              //4
public interface ClienteRepository extends JpaRepository <Cliente, Integer> {
    
}

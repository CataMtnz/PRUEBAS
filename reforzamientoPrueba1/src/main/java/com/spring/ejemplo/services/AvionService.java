package com.spring.ejemplo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.ejemplo.repositories.AvionRepository;

/*asociado al repositorio que es la interfaz para llamada de metodos de Repository */
@Service
public class AvionService {
    @Autowired 
    AvionRepository avionRepository;
    
}

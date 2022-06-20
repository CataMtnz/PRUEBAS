package com.pruebas.prueba1.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.models.Avion;
import com.generation.repositories.AvionRepository;

@Service
public class AutoService {
    @Autowired
    AvionRepository avionRepository;
    public void saveAvion(@Valid Avion avion) {
        /*metodo para guardar */
        avionRepository.save(avion);
    }
        /*herencia del hijo */
        public List<Avion> findAll(){
            return avionRepository.findAll();

        }
        public Avion buscarId(Long id) {
            return avionRepository.findById(id).get();
        }

    }
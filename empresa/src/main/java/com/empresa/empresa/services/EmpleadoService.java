package com.empresa.empresa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.empresa.models.Empleado;
import com.empresa.empresa.repositories.EmpleadoRepository;

@Service
public class EmpleadoService {
    
    @Autowired
    EmpleadoRepository empleadoRepository;

    public void empleadosGuardados(Empleado empleado) {
        empleadoRepository.save(empleado);
    }

    public List<Empleado> buscar() {
        return empleadoRepository.findAll();
    }

    public Empleado editar(Integer id) {

        return empleadoRepository.findById(id).get();
    }

    public void eliminar(Integer id) {
        empleadoRepository.deleteById(id);
    }

    

    
}

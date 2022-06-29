package com.empresa.empresa.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.empresa.models.Cliente;
import com.empresa.empresa.repositories.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public void registroCliente(@Valid Cliente cliente) {
        //14
        clienteRepository.save(cliente);
    }

    public List<Cliente> findAll() {
        //17
        return clienteRepository.findAll();
    }

    
}

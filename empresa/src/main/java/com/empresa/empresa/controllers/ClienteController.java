package com.empresa.empresa.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.empresa.empresa.models.Cliente;
import com.empresa.empresa.services.ClienteService;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
    //5
    @Autowired
    ClienteService clienteService;

    //1
    @RequestMapping("")
    //2                                             //3
    public String cliente(@ModelAttribute("cliente")Cliente cliente){
        return "cliente.jsp";
    }
    
@PostMapping("/guardar")
//6                         //7 link jsp                    //8 me traigo el objeto 9 10
public String guardarCliente(@Valid @ModelAttribute("cliente")Cliente cliente, BindingResult result, Model model){
    //11
    if (result.hasErrors()){
        model.addAttribute("msgError", "Ingrese los datos correctamente");
        return "cliente.jsp";
    }else{
        //12                          //13
        clienteService.registroCliente(cliente);
        //15 lista                  //16
        List<Cliente>listaClientes = clienteService.findAll();
        //18                               //19
        model.addAttribute("registroCliente", listaClientes);
        return "mostrarCliente.jsp";
    }
}
}

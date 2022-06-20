package com.pruebas.prueba1.controllers;

import java.nio.file.Path;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pruebas.prueba1.models.Avion;
import com.pruebas.prueba1.services.AvionService;

@Controller
@RequestMapping("/avion")
public class AvionController {
    @Autowired
    AvionService avionService;

    @RequestMapping("")
    public String inicio(@ModelAttribute("avion")Avion avion){

    return "registroAvion.jsp";
    }
    @RequestMapping("/guardar")
    public String guardarAvion(@Valid @ModelAttribute("avion") Avion avion, BindingResult resultado, 
    Model model){
        if(resultado.hasErrors()){
            model.addAttribute("msgError","Datos erroneos");
            return "registroAvion.jsp";

        }else{
        
            avionService.saveAvion(avion);
            List<Avion> listaAviones = avionService.findAll();
            model.addAttribute("avionesCapturados", listaAviones);
            return "mostrarAviones.jsp";
        }
        }

        @RequestMapping("/mostrar")
        public String mostrar(Model model){
            List<Avion> listaAviones = avionService.findAll();


            model.addAttribute("avionesCapturados", listaAviones);
    
            return "mostrarAviones.jsp";
        }
        @RequestMapping("/editar/{id}") 
            public String editar(@PathVariable("id")Long id, Model model){
            
                System.out.println("el id a editar del avion es: " +id );
                Avion avion = avionService.buscarId(id);

                model.addAttribute("avion",avion);/*pasa al jsp */
                return "registroAvion.jsp";
        }

        @PostMapping("/actualizar/{id}")
        public String actualizarAvion(@PathVariable ("id") Long id, @Valid @ModelAttribute("avion") Avion avion, BindingResult resultado, 
        Model model){
        if(resultado.hasErrors()){
            model.addAttribute("msgError","Datos erroneos");
            return "registroAvion.jsp";

        }else{
            avion.setId(id);
            avionService.saveAvion(avion);

            List<Avion> listaAviones = avionService.findAll();

            model.addAttribute("avionesCapturados", listaAviones);
            return "mostrarAviones.jsp";
        }
        }
        }
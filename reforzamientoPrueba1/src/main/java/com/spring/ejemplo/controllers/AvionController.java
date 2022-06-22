package com.spring.ejemplo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.ejemplo.models.Avion;
import com.spring.ejemplo.services.AvionService;

/*controller service y repository @ */

@Controller
/*Inicio de ruta solo calses va con Mayus y palabras completas */
@RequestMapping("/avion")
public class AvionController {

    /*vuelta a atras */
    @Autowired
    AvionService avionService;
    
    @RequestMapping("")
    /*llamamos al objeto modelo */
    public String inicio (@ModelAttribute("avion") Avion avion){
        return"avion.jsp";
    }

    @PostMapping("/guardar")
    /*llamamos al formulario a través del método post */
    /*Validar->llegan los datos, ver si el post esta correcto en los atributos ->Bindingresult */
    public String guardar (@Valid @ModelAttribute("avion") Avion avion, BindingResult result, Model model){
        return"avionGuardado.jsp";
    }
    
}


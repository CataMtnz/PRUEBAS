package com.empresa.empresa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.empresa.empresa.models.Empleado;
import com.empresa.empresa.services.EmpleadoService;


@Controller
@RequestMapping("/empleado")
public class EmpleadoController {

    @Autowired
    EmpleadoService empleadoService;

    @RequestMapping("")
    public String empleado(@ModelAttribute("empleado") Empleado empleado){
        return "empleado.jsp";

    }

    @PostMapping("/guardar")
    public String guardarEmpleado(@ModelAttribute("empleado") Empleado empleado, BindingResult result, Model model ){

        if (result.hasErrors()){
            model.addAttribute("msgError", "Ingrese los datos correctamente");
            return "empleado.jsp";
        }else{
            empleadoService.empleadosGuardados(empleado);
            /*LLAMAMOS A LA DB CON SERVICE */
            List<Empleado>listaEmpleados= empleadoService.buscar();
            model.addAttribute("empleadosCapturados", listaEmpleados);
            return "mostrarEmpleado.jsp";
        }
        
    }

    @RequestMapping("/mostrar")
    public String mostrarEmpleado(Model model){
        List<Empleado>listaEmpleados= empleadoService.buscar();
            model.addAttribute("empleadosCapturados", listaEmpleados);
            return "mostrarEmpleado.jsp";

    }

    @RequestMapping("/editar/{id}")
    public String editarEmpleados(@PathVariable("id")Integer id,Model model){
        Empleado empleado = empleadoService.editar(id);
        model.addAttribute("empleado", empleado);
        return "editarEmpleado.jsp";
    }

    @PostMapping("/actualizar/{id}")
    public String actualizarEmpleado(@PathVariable("id")Integer id, @ModelAttribute("empleado") Empleado empleado, BindingResult result, Model model){
        if (result.hasErrors()){
            model.addAttribute("msgError", "Ingrese los datos correctamente");
            return "editarEmpleado.jsp";
        }else{
            empleadoService.empleadosGuardados(empleado);
            List<Empleado>listaEmpleados= empleadoService.buscar();
            model.addAttribute("empleadosCapturados", listaEmpleados);
            return "redirect:/empleado/mostrar";
        }
        
    }

    @RequestMapping("/eliminar/{id}")
    public String eliminarEmpleado(@PathVariable("id")Integer id){
        empleadoService.eliminar(id);
        return "redirect:/empleado/mostrar";
    }

}


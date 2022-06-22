package com.spring.ejemplo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="aviones")

public class Avion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    private String cantidadVentanas; /*ver en el boton  */
    private String cantidadAsientos;
    private String modelo;
    
    public Avion() {
    }

    public Avion(Long id, String cantidadVentanas, String cantidadAsientos, String modelo) {
        this.id = id;
        this.cantidadVentanas = cantidadVentanas;
        this.cantidadAsientos = cantidadAsientos;
        this.modelo = modelo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCantidadVentanas() {
        return cantidadVentanas;
    }

    public void setCantidadVentanas(String cantidadVentanas) {
        this.cantidadVentanas = cantidadVentanas;
    }

    public String getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(String cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}

package com.pruebas.prueba1.models;

import java.lang.annotation.Inherited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="aviones")
public class Avion {
@Id @GeneratedValue (strategy = GenerationType.IDENTITY)
private Long id;

private String modelo;
private String cantidadAlas;
private String cantidadVentanas;

public Avion() {
}

public Avion(Long id, String modelo, String cantidadAlas, String cantidadVentanas) {
    this.id = id;
    this.modelo = modelo;
    this.cantidadAlas = cantidadAlas;
    this.cantidadVentanas = cantidadVentanas;
}

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getModelo() {
    return modelo;
}

public void setModelo(String modelo) {
    this.modelo = modelo;
}

public String getCantidadAlas() {
    return cantidadAlas;
}

public void setCantidadAlas(String cantidadAlas) {
    this.cantidadAlas = cantidadAlas;
}

public String getCantidadVentanas() {
    return cantidadVentanas;
}

public void setCantidadVentanas(String cantidadVentanas) {
    this.cantidadVentanas = cantidadVentanas;
}

@Override
public String toString() {
    return "Avion [cantidadAlas=" + cantidadAlas + ", cantidadVentanas=" + cantidadVentanas + ", id=" + id + ", modelo="
            + modelo + "]";
}



}

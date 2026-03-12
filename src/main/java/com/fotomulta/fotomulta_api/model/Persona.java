package com.fotomulta.fotomulta_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "personas")
@Getter
@Setter
@AllArgsConstructor

public class Persona extends Propietario{


    private String apellido;

    // Constructor vacío requerido por JPA
    public Persona() {
        super();
    }

    // Constructor para facilitar la creación de objetos
    public Persona(String identificacion, String nombre, String direccion, String apellido) {
        super(identificacion, nombre, direccion);
        this.apellido = apellido;
    }
}

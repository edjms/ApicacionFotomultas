package com.fotomulta.fotomulta_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "empresas")
@Getter
@Setter
@AllArgsConstructor

public class Empresa extends Propietario{
    private String nit;
    private String representanteLegal;

    // Constructor vacío para JPA
    public Empresa() {
        super();
    }

    // Constructor para facilitar la creación de objetos
    public Empresa(String identificacion, String nombre, String direccion, String nit, String representanteLegal) {
        super(identificacion, nombre, direccion);
        this.nit = nit;
        this.representanteLegal = representanteLegal;
    }

}

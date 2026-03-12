package com.fotomulta.fotomulta_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "propietario")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Propietario {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String identificacion;
    private String nombre;
    private String direccion;

    public Propietario() {
    }
    public Propietario(String identificacion, String nombre, String direccion) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.direccion = direccion;
    }

}

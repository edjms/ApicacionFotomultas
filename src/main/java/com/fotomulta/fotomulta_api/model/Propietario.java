package com.fotomulta.fotomulta_api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "propietario")
@Data
@NoArgsConstructor
public class Propietario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   // @Column(nullable = false, unique = true)
    private String identificacion;
    private String nombre;
    private String direccion;

    @OneToMany(mappedBy = "propietario",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<TipoPropietario> propietario = new HashSet<>();

    public Propietario(Long id, String identificacion, String nombre, String direccion) {
        this.id = id;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.direccion = direccion;
    }
}

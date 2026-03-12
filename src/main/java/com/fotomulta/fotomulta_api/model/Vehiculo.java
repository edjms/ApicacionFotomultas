package com.fotomulta.fotomulta_api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "vehiculos")
@Getter
@Setter

@Inheritance(strategy = InheritanceType.JOINED)
public class Vehiculo {

    @Id
    private String placa; // Usamos la placa como ID porque es única

    private String marca;

    @Column(name = "fecha_matricula")
    private LocalDate fechaMatricula;

    @Enumerated(EnumType.STRING)
    private TipoVehiculo tipo;

    // Relación: Muchos vehículos pueden pertenecer a un mismo Propietario
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "propietario_id", nullable = false)
    private Propietario propietario;

    public Vehiculo() {}

    public Vehiculo(String placa, String marca, LocalDate fechaMatricula, TipoVehiculo tipo, Propietario propietario) {
        this.placa = placa;
        this.marca = marca;
        this.fechaMatricula = fechaMatricula;
        this.tipo = tipo;
        this.propietario = propietario;
    }
}

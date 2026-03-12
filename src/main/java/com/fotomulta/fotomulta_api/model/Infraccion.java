package com.fotomulta.fotomulta_api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "infracciones")
@Getter
@Setter
public class Infraccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime fechaHora;

    @Column(nullable = false)
    private String descripcion;

    // Aquí guardamos si fue "AGENTE" o "CAMARA"
    @Column(name = "tipo_deteccion", nullable = false)
    private String tipoDeteccion;

    // Nombre del agente o código de la cámara
    @Column(name = "identificador_deteccion")
    private String identificadorDeteccion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vehiculo_placa", nullable = false)
    private Vehiculo vehiculo;

    public Infraccion() {}

    public Infraccion(LocalDateTime fechaHora, String descripcion, String tipoDeteccion, String identificadorDeteccion, Vehiculo vehiculo) {
        this.fechaHora = fechaHora;
        this.descripcion = descripcion;
        this.tipoDeteccion = tipoDeteccion;
        this.identificadorDeteccion = identificadorDeteccion;
        this.vehiculo = vehiculo;
    }
}

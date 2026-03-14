package com.fotomulta.fotomulta_api.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "infraccion")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Infraccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_infraccion", nullable = false)
    private LocalDate fechaInfraccion;

    // Relación con vehículo
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "vehiculo_id", nullable = false)
    private Vehiculo vehiculo;

    // Quién la accionó: agente o cámara
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private MedioDeteccion medioDeteccion;
}
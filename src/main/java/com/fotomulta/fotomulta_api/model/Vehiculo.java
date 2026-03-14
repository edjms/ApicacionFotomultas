package com.fotomulta.fotomulta_api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "vehiculo")
public class Vehiculo {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(nullable = false, unique = true)
private String placa;

@Column(nullable = false)
private String marca;

@Column(name = "fecha_matricula", nullable = false)
private LocalDate fechaMatricula;

@ManyToOne(fetch = FetchType.EAGER)
@JoinColumn(name = "propietario_id", nullable = false)
private Propietario propietario;

@Enumerated(EnumType.STRING)
@Column(nullable = false)
private TipoVehiculo tipo;

@OneToMany(mappedBy = "vehiculo", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
@JsonIgnore
private Set<Infraccion> infracciones = new HashSet<>();

// Constructor vacío
public Vehiculo() {}

// Getters y Setters
public Long getId() { return id; }
public void setId(Long id) { this.id = id; }

public String getPlaca() { return placa; }
public void setPlaca(String placa) { this.placa = placa; }

public String getMarca() { return marca; }
public void setMarca(String marca) { this.marca = marca; }

public LocalDate getFechaMatricula() { return fechaMatricula; }
public void setFechaMatricula(LocalDate fechaMatricula) { this.fechaMatricula = fechaMatricula; }

public Propietario getPropietario() { return propietario; }
public void setPropietario(Propietario propietario) { this.propietario = propietario; }

public TipoVehiculo getTipo() { return tipo; }
public void setTipo(TipoVehiculo tipo) { this.tipo = tipo; }

public Set<Infraccion> getInfracciones() { return infracciones; }
public void setInfracciones(Set<Infraccion> infracciones) { this.infracciones = infracciones; }

// Métodos auxiliares para mantener la relación bidireccional
public void addInfraccion(Infraccion infraccion) {
    infracciones.add(infraccion);
    infraccion.setVehiculo(this);
}

public void removeInfraccion(Infraccion infraccion) {
    infracciones.remove(infraccion);
    infraccion.setVehiculo(null);
}
}
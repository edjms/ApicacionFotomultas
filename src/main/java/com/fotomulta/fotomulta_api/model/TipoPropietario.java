package com.fotomulta.fotomulta_api.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Tipo_pro")
public class TipoPropietario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "propietario_id")
    private Propietario propietario;

    // Tipo: empresa o persona
    private String tipo;

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public String getTipo() {
        return tipo;
    }
}

package com.fotomulta.fotomulta_api.repository;

import com.fotomulta.fotomulta_api.model.TipoPropietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoPropietarioRepository extends JpaRepository <TipoPropietario,Long> {
}

package com.fotomulta.fotomulta_api.repository;

import com.fotomulta.fotomulta_api.model.Propietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropietarioRepository extends JpaRepository <Propietario,Long> {
}

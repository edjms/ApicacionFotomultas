package com.fotomulta.fotomulta_api.repository;

import com.fotomulta.fotomulta_api.model.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {
    Vehiculo findByPlaca(String placa);
}


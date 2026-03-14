package com.fotomulta.fotomulta_api.repository;

import com.fotomulta.fotomulta_api.model.Infraccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InfraccionRepository extends JpaRepository<Infraccion, Long> {
        List<Infraccion> findByVehiculoId(Long vehiculoId);

    @Query("SELECT i FROM Infraccion i JOIN i.vehiculo v WHERE v.placa = :placa")
    List<Infraccion> findByVehiculoPlaca(@Param("placa") String placa);

}


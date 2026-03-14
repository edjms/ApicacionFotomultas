package com.fotomulta.fotomulta_api.service;

import com.fotomulta.fotomulta_api.model.Infraccion;
import com.fotomulta.fotomulta_api.repository.InfraccionRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class InfraccionService {

    private final InfraccionRepository infraccionRepository;

    public InfraccionService(InfraccionRepository infraccionRepository) {
        this.infraccionRepository = infraccionRepository;
    }

    public Infraccion crearInfraccion(Infraccion infraccion) {
        return infraccionRepository.save(infraccion);
    }

    public List<Infraccion> listarInfracciones() {
        return infraccionRepository.findAll();
    }

    public List<Infraccion> listarPorVehiculo(Long vehiculoId) {
        return infraccionRepository.findByVehiculoId(vehiculoId);
    }
    public List<Infraccion> listarPorVehiculoPlaca(String placa) {
        return infraccionRepository.findByVehiculoPlaca(placa);
    }

    public void eliminarInfraccion(Long id) {
        infraccionRepository.deleteById(id);
    }
}


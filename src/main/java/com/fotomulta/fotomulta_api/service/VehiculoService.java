package com.fotomulta.fotomulta_api.service;

import com.fotomulta.fotomulta_api.model.Vehiculo;
import com.fotomulta.fotomulta_api.repository.VehiculoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class VehiculoService {

    private final VehiculoRepository vehiculoRepository;

    public VehiculoService(VehiculoRepository vehiculoRepository) {
        this.vehiculoRepository = vehiculoRepository;
    }

    public Vehiculo crearVehiculo(Vehiculo vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }

    public Vehiculo obtenerVehiculo(Long id) {
        return vehiculoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Vehículo no encontrado"));
    }

    public Vehiculo obtenerVehiculoPorPlaca(String placa) {
        return vehiculoRepository.findByPlaca(placa);
    }

    public List<Vehiculo> listarVehiculos() {
        return vehiculoRepository.findAll();
    }

    public void eliminarVehiculo(Long id) {
        vehiculoRepository.deleteById(id);
    }
}
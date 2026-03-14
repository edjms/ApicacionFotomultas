package com.fotomulta.fotomulta_api.controller;

import com.fotomulta.fotomulta_api.model.Vehiculo;
import com.fotomulta.fotomulta_api.service.VehiculoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehiculos")
public class VehiculoController {

    private final VehiculoService vehiculoService;

    public VehiculoController(VehiculoService vehiculoService) {
        this.vehiculoService = vehiculoService;
    }

    @PostMapping
    public Vehiculo crearVehiculo(@RequestBody Vehiculo vehiculo) {
        return vehiculoService.crearVehiculo(vehiculo);
    }

    @GetMapping("/{id}")
    public Vehiculo obtenerVehiculo(@PathVariable Long id) {
        return vehiculoService.obtenerVehiculo(id);
    }

    @GetMapping
    public List<Vehiculo> listarVehiculos() {
        return vehiculoService.listarVehiculos();
    }

    @DeleteMapping("/{id}")
    public void eliminarVehiculo(@PathVariable Long id) {
        vehiculoService.eliminarVehiculo(id);
    }
}

package com.fotomulta.fotomulta_api.controller;

import com.fotomulta.fotomulta_api.model.Infraccion;
import com.fotomulta.fotomulta_api.service.InfraccionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/infracciones")
public class InfraccionController {

    private final InfraccionService infraccionService;

    public InfraccionController(InfraccionService infraccionService) {
        this.infraccionService = infraccionService;
    }

    @PostMapping
    public Infraccion crearInfraccion(@RequestBody Infraccion infraccion) {
        return infraccionService.crearInfraccion(infraccion);
    }

    @GetMapping
    public List<Infraccion> listarInfracciones() {
        return infraccionService.listarInfracciones();
    }

    @GetMapping("/vehiculo/{vehiculoId}")
    public List<Infraccion> listarPorVehiculo(@PathVariable Long vehiculoId) {
        return infraccionService.listarPorVehiculo(vehiculoId);
    }

    @GetMapping("/placa/{placa}")
    public ResponseEntity<List<Infraccion>> consultarPorPlaca(@PathVariable String placa) {
        List<Infraccion> infracciones = infraccionService.listarPorVehiculoPlaca(placa);
        return ResponseEntity.ok(infracciones);

    }

        @DeleteMapping("/{id}")
    public void eliminarInfraccion(@PathVariable Long id) {
        infraccionService.eliminarInfraccion(id);
    }
}

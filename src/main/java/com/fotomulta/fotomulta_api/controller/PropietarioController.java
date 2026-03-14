package com.fotomulta.fotomulta_api.controller;

import com.fotomulta.fotomulta_api.model.Propietario;
import com.fotomulta.fotomulta_api.model.TipoPropietario;

import com.fotomulta.fotomulta_api.service.PropietarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/propietarios")
@CrossOrigin("*")
public class PropietarioController {

    @Autowired
    private PropietarioService propietarioService;

    @PostMapping
    public Propietario crearPropietario(@RequestBody Propietario propietario) {
        return propietarioService.guardarPropietario(propietario);
    }



}

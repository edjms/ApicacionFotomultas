package com.fotomulta.fotomulta_api.controller;

import com.fotomulta.fotomulta_api.model.TipoPropietario;
import com.fotomulta.fotomulta_api.service.TipoPropietarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tipos-propietario")
public class TipoPropietarioController {
    @Autowired
    private TipoPropietarioService tipoPropietarioService;

    @PostMapping
    public ResponseEntity<TipoPropietario> crear(@RequestBody TipoPropietario tipoPropietario) {
        TipoPropietario nuevo = tipoPropietarioService.guardar(tipoPropietario);
        return ResponseEntity.ok(nuevo);
    }

}

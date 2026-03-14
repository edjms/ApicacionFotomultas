package com.fotomulta.fotomulta_api.service;

import com.fotomulta.fotomulta_api.model.TipoPropietario;
import com.fotomulta.fotomulta_api.repository.TipoPropietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoPropietarioService {


    @Autowired
    private TipoPropietarioRepository tipoPropietarioRepository;

    public TipoPropietario guardar(TipoPropietario tipoPropietario) {
        return tipoPropietarioRepository.save(tipoPropietario);
    }

}

package com.fotomulta.fotomulta_api.service;
import com.fotomulta.fotomulta_api.model.TipoPropietario;
import com.fotomulta.fotomulta_api.model.Propietario;
import com.fotomulta.fotomulta_api.repository.PropietarioRepository;
import com.fotomulta.fotomulta_api.repository.TipoPropietarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PropietarioService {

    @Autowired
    private PropietarioRepository propietarioRepository;


    @Transactional
    public Propietario guardarPropietario(Propietario propietario) {
        return propietarioRepository.save(propietario);
    }



}


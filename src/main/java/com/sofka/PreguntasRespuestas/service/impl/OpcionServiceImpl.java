package com.sofka.PreguntasRespuestas.service.impl;

import com.sofka.PreguntasRespuestas.entity.Opcion;
import com.sofka.PreguntasRespuestas.repository.OpcionRepository;
import com.sofka.PreguntasRespuestas.service.OpcionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OpcionServiceImpl implements OpcionService {
    @Resource
    OpcionRepository opcionRepository;
    @Override
    public List<Opcion> getIdPregunta(int nivel) {
         int idPregunta= opcionRepository.getIdPregunta(nivel);
         return opcionRepository.findByIdPregunta( idPregunta);
    }
}

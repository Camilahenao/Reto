package com.sofka.PreguntasRespuestas.service;

import com.sofka.PreguntasRespuestas.entity.Opcion;

import java.util.List;

public interface OpcionService {
    List<Opcion> getIdPregunta(int nivel);
}

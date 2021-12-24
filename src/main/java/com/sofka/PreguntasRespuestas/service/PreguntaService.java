package com.sofka.PreguntasRespuestas.service;

import com.sofka.PreguntasRespuestas.dto.PreguntaDTO;
import com.sofka.PreguntasRespuestas.entity.Pregunta;

import java.util.List;

public interface PreguntaService {
    Pregunta add(PreguntaDTO pregunta);
    List<Pregunta> getAll();
}

package com.sofka.PreguntasRespuestas.service;

import com.sofka.PreguntasRespuestas.dto.PreguntaDTO;
import com.sofka.PreguntasRespuestas.entity.Jugador;
import com.sofka.PreguntasRespuestas.entity.Pregunta;

import java.util.List;

public interface JugadorService {
    Jugador add(Jugador jugador);
    List<Jugador> getAll();
}

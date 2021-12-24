package com.sofka.PreguntasRespuestas.service;

import com.sofka.PreguntasRespuestas.entity.HistorialJuego;

import java.util.List;

public interface HistorialJuegoService {
    HistorialJuego getHistorial(int idJugador);
    List<HistorialJuego> getAll();
    void saveHistorial(HistorialJuego historialJuego);
}

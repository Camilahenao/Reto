package com.sofka.PreguntasRespuestas.service.impl;

import com.sofka.PreguntasRespuestas.entity.HistorialJuego;
import com.sofka.PreguntasRespuestas.repository.HistorialJuegoRepository;
import com.sofka.PreguntasRespuestas.service.HistorialJuegoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HistorialJuegoServiceImpl implements HistorialJuegoService {

    @Resource
    HistorialJuegoRepository historialJuegoRepository;
    @Override
    public HistorialJuego getHistorial(int idJugador) {
        return historialJuegoRepository.findByIdJugador(idJugador);
    }

    @Override
    public List<HistorialJuego> getAll() {
        return historialJuegoRepository.findAll();
    }

    @Override
    public void saveHistorial(HistorialJuego historialJuego) {
        historialJuegoRepository.save(historialJuego);
    }

}

package com.sofka.PreguntasRespuestas.service.impl;

import com.sofka.PreguntasRespuestas.entity.Jugador;
import com.sofka.PreguntasRespuestas.repository.JugadorRepository;
import com.sofka.PreguntasRespuestas.service.JugadorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class JugadorServiceImpl implements JugadorService {
    @Resource
    JugadorRepository jugadorRepository;
    @Override
    public Jugador add(Jugador jugador) {
        return jugadorRepository.save(jugador);
    }

    @Override
    public List<Jugador> getAll() {
        return jugadorRepository.findAll();
    }
}

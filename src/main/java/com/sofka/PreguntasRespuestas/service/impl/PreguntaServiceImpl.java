package com.sofka.PreguntasRespuestas.service.impl;

import com.sofka.PreguntasRespuestas.dto.PreguntaDTO;
import com.sofka.PreguntasRespuestas.entity.Opcion;
import com.sofka.PreguntasRespuestas.entity.Pregunta;
import com.sofka.PreguntasRespuestas.repository.OpcionRepository;
import com.sofka.PreguntasRespuestas.repository.PreguntaRepository;
import com.sofka.PreguntasRespuestas.service.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PreguntaServiceImpl implements PreguntaService {

    @Autowired
    private PreguntaRepository preguntaRepository;
    @Autowired
    private OpcionRepository opcionRepository;

    @Override
    //@Transactional(rollbackFor = {Exception.class})
    public Pregunta add(PreguntaDTO preguntaDTO) {
        Pregunta pregunta = new Pregunta();
        pregunta.setContenido(preguntaDTO.getPregunta());
        pregunta.getCategoria().setId(preguntaDTO.getIdCategoria());
        pregunta = preguntaRepository.save(pregunta);
        guardarOpcion(preguntaDTO.getOpcionUno(),preguntaDTO.isOpcionUnoCorrecta(),pregunta.getId());
        guardarOpcion(preguntaDTO.getOpcionDos(),preguntaDTO.isOpcionDosCorrecta(),pregunta.getId());
        guardarOpcion(preguntaDTO.getOpcionTres(),preguntaDTO.isOpcionTresCorrecta(),pregunta.getId());
        guardarOpcion(preguntaDTO.getOpcionCuatro(),preguntaDTO.isOpcionCuatroCorrecta(),pregunta.getId());
        return pregunta;
    }

    @Override
    public List<Pregunta> getAll() {
        List<Pregunta> preguntas = preguntaRepository.findAll();
        return preguntas;
    }

    private void guardarOpcion(String contenido,boolean correcta, int id){
        Opcion opcion = new Opcion();
        opcion.setContenido(contenido);
        opcion.getPregunta().setId(id);
        opcion.setCorrecta(correcta);
        opcionRepository.save(opcion);
    }
}

package com.sofka.PreguntasRespuestas.service;

import com.sofka.PreguntasRespuestas.entity.Categoria;

import java.util.List;

public interface CategoriaService {
    List<Categoria> findCategorias();
}

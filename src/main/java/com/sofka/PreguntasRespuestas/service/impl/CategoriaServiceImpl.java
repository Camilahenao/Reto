package com.sofka.PreguntasRespuestas.service.impl;

import com.sofka.PreguntasRespuestas.entity.Categoria;
import com.sofka.PreguntasRespuestas.repository.CategoriaRepository;
import com.sofka.PreguntasRespuestas.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    @Autowired
    CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> findCategorias() {
        List<Categoria> categoria = categoriaRepository.findAll();
        return categoria;
    }
}

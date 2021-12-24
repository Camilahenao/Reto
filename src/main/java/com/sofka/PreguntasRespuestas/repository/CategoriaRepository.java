package com.sofka.PreguntasRespuestas.repository;

import com.sofka.PreguntasRespuestas.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}

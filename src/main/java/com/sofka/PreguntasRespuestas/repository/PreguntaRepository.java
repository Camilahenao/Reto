package com.sofka.PreguntasRespuestas.repository;

import com.sofka.PreguntasRespuestas.entity.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreguntaRepository extends JpaRepository<Pregunta, Integer> {
}

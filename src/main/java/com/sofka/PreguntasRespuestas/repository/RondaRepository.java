package com.sofka.PreguntasRespuestas.repository;

import com.sofka.PreguntasRespuestas.entity.Ronda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RondaRepository extends JpaRepository<Ronda, Integer> {
}

package com.sofka.PreguntasRespuestas.repository;

import com.sofka.PreguntasRespuestas.entity.Premio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PremioRepository extends JpaRepository<Premio, Integer> {
}

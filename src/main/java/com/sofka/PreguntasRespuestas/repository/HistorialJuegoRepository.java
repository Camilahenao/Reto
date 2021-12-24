package com.sofka.PreguntasRespuestas.repository;

import com.sofka.PreguntasRespuestas.entity.HistorialJuego;
import com.sofka.PreguntasRespuestas.service.HistorialJuegoService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HistorialJuegoRepository extends JpaRepository<HistorialJuego, Integer> {
    @Query(value = "SELECT * FROM historial_juego WHERE id_jugador = :idJugador order by id_historial_juego desc limit 1", nativeQuery = true)
    HistorialJuego findByIdJugador(@Param("idJugador")int idJugador);
}

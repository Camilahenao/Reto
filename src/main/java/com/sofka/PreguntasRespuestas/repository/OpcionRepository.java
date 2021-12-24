package com.sofka.PreguntasRespuestas.repository;

import com.sofka.PreguntasRespuestas.entity.Opcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OpcionRepository extends JpaRepository<Opcion, Integer> {
    @Query(value = "SELECT * FROM opcion WHERE id_pregunta = :idPregunta", nativeQuery = true)
    List<Opcion> findByIdPregunta(@Param("idPregunta")int idPregunta);
    @Query(value = "SELECT o.id_pregunta FROM opcion as o\n" +
            "    JOIN pregunta p on o.id_pregunta = p.id_pregunta\n" +
            "    join categoria c on p.id_categoria = c.id_categoria\n" +
            "    join ronda r on c.id_ronda = r.id_ronda\n" +
            "    WHERE r.nivel = :nivel ORDER BY RANDOM() LIMIT 1", nativeQuery = true)
    Integer getIdPregunta(@Param("nivel")int nivel);
}

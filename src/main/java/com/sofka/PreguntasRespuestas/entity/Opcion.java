package com.sofka.PreguntasRespuestas.entity;

import lombok.*;
import org.hibernate.Hibernate;
import javax.persistence.*;
import java.util.Objects;

@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "opcion")
public class Opcion {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_opcion")
    private Integer id;
    @Column(name = "correcta")
    private boolean correcta;
    @Column(name = "contenido")
    private String contenido;
    @ManyToOne
    @JoinColumn(name = "id_pregunta")
    private Pregunta pregunta;

    public Integer getId() {
        return id;
    }

    public boolean isCorrecta() {
        return correcta;
    }

    public String getContenido() {
        return contenido;
    }

    public Pregunta getPregunta() {
        if(pregunta == null) pregunta = new Pregunta();
        return pregunta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Opcion opcion = (Opcion) o;
        return id != null && Objects.equals(id, opcion.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

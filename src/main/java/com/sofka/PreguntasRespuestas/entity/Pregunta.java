package com.sofka.PreguntasRespuestas.entity;

import lombok.*;
import org.hibernate.Hibernate;
import javax.persistence.*;
import java.util.Objects;

@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "pregunta")
public class Pregunta {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_pregunta")
    private Integer id;
    @Column(name = "contenido")
    private String contenido;
    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    public Integer getId() {
        return id;
    }

    public String getContenido() {
        return contenido;
    }

    public Categoria getCategoria() {
        if(categoria == null) categoria = new Categoria();
        return categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Pregunta pregunta = (Pregunta) o;
        return id != null && Objects.equals(id, pregunta.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

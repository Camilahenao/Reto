package com.sofka.PreguntasRespuestas.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "jugador")
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_jugador")
    private Integer id;
    @Column(name = "nombre")
    private String nombre;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Jugador jugador = (Jugador) o;
        return id != null && Objects.equals(id, jugador.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

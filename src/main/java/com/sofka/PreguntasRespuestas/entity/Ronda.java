package com.sofka.PreguntasRespuestas.entity;

import lombok.*;
import org.hibernate.Hibernate;
import javax.persistence.*;
import java.util.Objects;

@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "ronda")
public class Ronda {

    @Id
    @Column(name = "id_ronda")
    private Integer id;
    @Column(name = "nivel")
    private int nivel;
    @ManyToOne
    @JoinColumn(name = "id_premio")
    private Premio premio;

    public Integer getId() {
        return id;
    }

    public int getNivel() {
        return nivel;
    }

    public Premio getRonda() {
        if (premio == null) premio = new Premio();
        return premio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Ronda ronda = (Ronda) o;
        return id != null && Objects.equals(id, ronda.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

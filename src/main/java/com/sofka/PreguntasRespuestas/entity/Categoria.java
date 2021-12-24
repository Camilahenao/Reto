package com.sofka.PreguntasRespuestas.entity;

import lombok.*;
import org.hibernate.Hibernate;
import javax.persistence.*;
import java.util.Objects;

@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "categoria")
public class Categoria {

    @Id
    @Column(name = "id_categoria")
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @ManyToOne
    @JoinColumn(name = "id_ronda")
    private Ronda ronda;

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Ronda getRonda() {
        if (ronda == null) ronda = new Ronda();
        return ronda;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Categoria categoria = (Categoria) o;
        return id != null && Objects.equals(id, categoria.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

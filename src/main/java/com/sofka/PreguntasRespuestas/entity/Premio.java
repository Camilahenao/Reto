package com.sofka.PreguntasRespuestas.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Data
@Entity
@Table(name = "premio")
public class Premio {

    @Id
    @Column(name = "id_premio")
    private Integer id;
    @Column(name = "dinero")
    private int dinero;
}

package com.sofka.PreguntasRespuestas.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "historial_juego")
public class HistorialJuego {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_historial_juego")
    private Integer id;
    @Column(name = "acumulado")
    private String acumulado;
    @ManyToOne
    @JoinColumn(name = "id_jugador")
    private Jugador jugador;
    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;
}

package com.sofka.PreguntasRespuestas.controller;

import com.sofka.PreguntasRespuestas.dto.PreguntaDTO;
import com.sofka.PreguntasRespuestas.entity.*;
import com.sofka.PreguntasRespuestas.service.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/juego")
public class JuegoController {

    @Resource
    private CategoriaService categoriaService;
    @Resource
    private PreguntaService preguntaService;
    @Resource
    private JugadorService jugadorService;
    @Resource
    private HistorialJuegoService historialJuegoService;
    @Resource
    private OpcionService opcionService;

    @GetMapping("/categorias")
    public List<Categoria> getCategorias() {
        return categoriaService.findCategorias();
    }

    @PostMapping("/agregarJugador")
    public Jugador guardarJugador(@RequestBody Jugador jugador) {
        return jugadorService.add(jugador);
    }

    @GetMapping("/preguntas")
    public List<Pregunta> buscarPreguntas() {
        return preguntaService.getAll();
    }

    @GetMapping("/jugadores")
    public List<Jugador> buscarJugadores() {
        return jugadorService.getAll();
    }

    @GetMapping("/historialJuego/{idJugador}")
    public HistorialJuego buscarHistorialJuego(@PathVariable int idJugador) {
        return historialJuegoService.getHistorial(idJugador);
    }
    @GetMapping("/historialJuego")
    public List<HistorialJuego> buscarHistorialJuego() {
        return historialJuegoService.getAll();
    }
    @PostMapping("/agregarHistorialJuego")
    public void guardarHistorial(@RequestBody HistorialJuego historialJuego) {
         historialJuegoService.saveHistorial(historialJuego);
    }
    @GetMapping("/pregunta/{nivel}")
    public List<Opcion> buscarPregunta(@PathVariable int nivel) {
        List<Opcion> opciones = opcionService.getIdPregunta(nivel);
        return opciones;
    }

    @PostMapping("/agregarPregunta")
    public Pregunta guardar(@RequestBody PreguntaDTO preguntaDTO) {
        return preguntaService.add(preguntaDTO);
    }
}

package com.sofka.PreguntasRespuestas.dto;

import lombok.Data;

@Data
public class PreguntaDTO {

    private Integer idCategoria;
    private String pregunta;
    private String opcionUno;
    private String opcionDos;
    private String opcionTres;
    private String opcionCuatro;
    private boolean opcionUnoCorrecta;
    private boolean opcionDosCorrecta;
    private boolean opcionTresCorrecta;
    private boolean opcionCuatroCorrecta;
}

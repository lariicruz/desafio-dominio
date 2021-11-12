package com.dio.desafio.dominio.model;

import lombok.Data;



@Data
public class Curso {
    private String titulo;
    private String descricao;
    private int cargaHoraria;

    public Curso() {
    }
}

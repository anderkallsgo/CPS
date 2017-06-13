package com.cps.Formulario;

import java.util.List;

public class Questao {

    private final String enunciado;
    private final List<Escala> listaDeEscalas;

    public Questao(String enunciado, List<Escala> listaDeEscalas) {

        this.enunciado = enunciado;
        this.listaDeEscalas = listaDeEscalas;
    }

    public String getEnunciado() {
        return enunciado;
    }
}

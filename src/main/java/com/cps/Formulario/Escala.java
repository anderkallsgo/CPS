package com.cps.Formulario;

public class Escala {

    private final String descricao;
    private final int valor;

    public Escala(String descricao, int valor) {

        this.descricao = descricao;
        this.valor = valor;
    }
    public String gerDescricao() {
        return descricao;
    }
    public int getValor() {
        return valor;
    }
}

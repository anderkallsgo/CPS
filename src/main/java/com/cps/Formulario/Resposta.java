package com.cps.Formulario;

public class Resposta {

    private Questao numQuestao;
    private final Escala escala;

    public Resposta(Questao numQuestao, Escala escala) {

        this.numQuestao = numQuestao;
        this.escala = escala;
    }

    public Escala getEscala(){
        return escala;
    }

    public Questao getNumQuestao() {
        return numQuestao;
    }
}

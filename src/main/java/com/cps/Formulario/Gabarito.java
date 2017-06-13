package com.cps.Formulario;

import java.util.ArrayList;
import java.util.List;

public class Gabarito {

    private String nome;
    private List<Resposta> resposta = new ArrayList<Resposta>();

    public Gabarito(String nome) {
        this.nome = nome;
    }
    public void adicionar(Resposta resposta) {
        this.resposta.add(resposta);
    }

    public int calcularEscalaTMais() {
        int escalaTMais = 0;
        for (int i=0; i<resposta.size(); i++){
            escalaTMais = resposta.get(0).getEscala().getValor()+ resposta.get(20).getEscala().getValor()
                    +resposta.get(40).getEscala().getValor()+resposta.get(60).getEscala().getValor()
                    +resposta.get(80).getEscala().getValor();
        }return escalaTMais;
    }
    public int calcularEscalaOMenos() {
        int escalaOMenos = 0;
        for (int i = 0; i < resposta.size(); i++) {
            escalaOMenos = resposta.get(1).getEscala().getValor() + resposta.get(21).getEscala().getValor()
                    + resposta.get(41).getEscala().getValor() + resposta.get(61).getEscala().getValor()
                    + resposta.get(81).getEscala().getValor();
        }return escalaOMenos;
    }

    public int calcularEscalaCMais() {
        int escalaCMais = 0;
        for (int i = 0; i < resposta.size(); i++) {
            escalaCMais = resposta.get(2).getEscala().getValor() + resposta.get(22).getEscala().getValor()
                    + resposta.get(42).getEscala().getValor() + resposta.get(62).getEscala().getValor()
                    + resposta.get(82).getEscala().getValor();
        }return escalaCMais;
    }

    public int calcularEscalaAMenos() {
        int escalaAMenos = 0;
        for (int i = 0; i < resposta.size(); i++) {
            escalaAMenos = resposta.get(3).getEscala().getValor() + resposta.get(23).getEscala().getValor()
                    + resposta.get(43).getEscala().getValor() + resposta.get(63).getEscala().getValor()
                    + resposta.get(83).getEscala().getValor();
        }return escalaAMenos;
    }

    public int calcularEscalaSMenos() {
        int escalaSMenos = 0;
        for (int i = 0; i < resposta.size(); i++) {
            escalaSMenos = resposta.get(5).getEscala().getValor() + resposta.get(25).getEscala().getValor()
                    + resposta.get(45).getEscala().getValor() + resposta.get(65).getEscala().getValor()
                    + resposta.get(85).getEscala().getValor();
        }return escalaSMenos;
    }

    public int calcularEscalaEMais() {

        int escalaEMais = 0;
        for (int i = 0; i < resposta.size(); i++) {
            escalaEMais = resposta.get(6).getEscala().getValor() + resposta.get(26).getEscala().getValor()
                    + resposta.get(46).getEscala().getValor() + resposta.get(66).getEscala().getValor()
                    + resposta.get(86).getEscala().getValor();
        }return escalaEMais;
    }

    public int calcularEscalaMMenos() {
        int escalaMMenos = 0;
        for (int i = 0; i < resposta.size(); i++) {
            escalaMMenos = resposta.get(7).getEscala().getValor() + resposta.get(27).getEscala().getValor()
                    + resposta.get(47).getEscala().getValor() + resposta.get(67).getEscala().getValor()
                    + resposta.get(87).getEscala().getValor();
        }return escalaMMenos;
    }

    public int calcularEscalaPMais() {
        int escalaPMais = 0;
        for (int i = 0; i < resposta.size(); i++) {
            escalaPMais = resposta.get(8).getEscala().getValor() + resposta.get(28).getEscala().getValor()
                    + resposta.get(48).getEscala().getValor() + resposta.get(68).getEscala().getValor()
                    + resposta.get(88).getEscala().getValor();
        }return escalaPMais;
    }

    public int calcularEscalaTMenos() {
        int escalaTMenos = 0;
        for (int i = 0; i < resposta.size(); i++) {
            escalaTMenos = resposta.get(10).getEscala().getValor() + resposta.get(30).getEscala().getValor()
                    + resposta.get(50).getEscala().getValor() + resposta.get(70).getEscala().getValor()
                    + resposta.get(90).getEscala().getValor();
        }return escalaTMenos;
    }

    public int calcularEscalaOMais() {
        int escalaOMais = 0;
        for (int i = 0; i < resposta.size(); i++) {
            escalaOMais = resposta.get(11).getEscala().getValor() + resposta.get(31).getEscala().getValor()
                    + resposta.get(51).getEscala().getValor() + resposta.get(71).getEscala().getValor()
                    + resposta.get(91).getEscala().getValor();
        }return escalaOMais;
    }

    public int calcularEscalaCMenos() {
        int escalaCMenos = 0;
        for (int i = 0; i < resposta.size(); i++) {
            escalaCMenos = resposta.get(12).getEscala().getValor() + resposta.get(32).getEscala().getValor()
                    + resposta.get(52).getEscala().getValor() + resposta.get(72).getEscala().getValor()
                    + resposta.get(92).getEscala().getValor();
        }return escalaCMenos;
    }

    public int calcularEscalaAMais() {
        int escalaAMais = 0;
        for (int i = 0; i < resposta.size(); i++) {
            escalaAMais = resposta.get(13).getEscala().getValor() + resposta.get(33).getEscala().getValor()
                    + resposta.get(53).getEscala().getValor() + resposta.get(73).getEscala().getValor()
                    + resposta.get(93).getEscala().getValor();
        }return escalaAMais;
    }

    public int calcularEscalaSMais() {
        int escalaSMais = 0;
        for (int i = 0; i < resposta.size(); i++) {
            escalaSMais = resposta.get(15).getEscala().getValor() + resposta.get(35).getEscala().getValor()
                    + resposta.get(55).getEscala().getValor() + resposta.get(75).getEscala().getValor()
                    + resposta.get(95).getEscala().getValor();
        }return escalaSMais;
    }

    public int calcularEscalaEMenos() {
        int escalaEMenos = 0;
        for (int i = 0; i < resposta.size(); i++) {
            escalaEMenos = resposta.get(16).getEscala().getValor() + resposta.get(36).getEscala().getValor()
                    + resposta.get(56).getEscala().getValor() + resposta.get(76).getEscala().getValor()
                    + resposta.get(96).getEscala().getValor();
        }return escalaEMenos;
    }

    public int calcularEscalaMMais() {
        int escalaMMais = 0;
        for (int i = 0; i < resposta.size(); i++) {
            escalaMMais = resposta.get(17).getEscala().getValor() + resposta.get(37).getEscala().getValor()
                    + resposta.get(57).getEscala().getValor() + resposta.get(77).getEscala().getValor()
                    + resposta.get(97).getEscala().getValor();
        }return escalaMMais;
    }

    public int calcularEscalaPMenos() {
        int escalaPMenos = 0;
        for (int i = 0; i < resposta.size(); i++) {
            escalaPMenos = resposta.get(18).getEscala().getValor() + resposta.get(38).getEscala().getValor()
                    + resposta.get(58).getEscala().getValor() + resposta.get(78).getEscala().getValor()
                    + resposta.get(98).getEscala().getValor();
        }return escalaPMenos;
    }

    public int calcularEscalaTPonto() {
        int escalaTPonto = (40 - calcularEscalaTMenos()) + calcularEscalaTMais();
        return escalaTPonto;
    }

    public int calcularEscalaOPonto() {
        int escalaOPonto = (40 - calcularEscalaOMenos() + calcularEscalaOMais());
        return escalaOPonto;
    }

    public int calcularEscalaCPonto() {
        int escalaCPonto = (40 - calcularEscalaCMenos() + calcularEscalaCMais());
        return escalaCPonto;
    }

    public int calcularEscalaAPonto() {
        int escalaAPonto = (40 - calcularEscalaAMenos() + calcularEscalaAMais());
        return escalaAPonto;
    }

    public int calcularEscalaSPonto() {
        int escalaSPonto = (40 - calcularEscalaSMenos() + calcularEscalaSMais());
        return escalaSPonto;
    }

    public int calcularEscalaEPonto() {
        int escalaEPonto = (40 - calcularEscalaEMenos() + calcularEscalaEMais());
        return escalaEPonto;
    }

    public int calcularEscalaMPonto() {
        int escalaMPonto = (40 - calcularEscalaMMenos() + calcularEscalaMMais());
        return escalaMPonto;
    }

    public int calcularEscalaPPonto() {
        int escalaPPonto = (40 - calcularEscalaPMenos()+ calcularEscalaPMais());
        return escalaPPonto;
    }

    public int calcularEscalaVPonto() {
        int escalaVPonto = (32 - calcularEscalaVMais() + calcularEscalaVMenos());
        return escalaVPonto;
    }

    private int calcularEscalaVMenos() {
        int escalaVMenos = 0;
        for (int i = 0; i < resposta.size(); i++) {
            escalaVMenos = resposta.get(14).getEscala().getValor() + resposta.get(34).getEscala().getValor()
                    + resposta.get(74).getEscala().getValor() + resposta.get(94).getEscala().getValor();
        }return escalaVMenos;
    }

    private int calcularEscalaVMais() {
        int escalaVMais = 0;
        for (int i = 0; i < resposta.size(); i++) {
            escalaVMais = resposta.get(4).getEscala().getValor() + resposta.get(24).getEscala().getValor()
                    + resposta.get(64).getEscala().getValor() + resposta.get(84).getEscala().getValor();
        }return escalaVMais;
    }

    public int calcularEscalaRPonto() {
        int escalaRPonto = (48 - calcularEscalaRMenos() + calcularEscalaRMais());
        return escalaRPonto;
    }

    private int calcularEscalaRMais() {
        int escalaRMais = 0;
        for (int i = 0; i < resposta.size(); i++) {
            escalaRMais = resposta.get(19).getEscala().getValor() + resposta.get(39).getEscala().getValor()
                    + resposta.get(44).getEscala().getValor() + resposta.get(59).getEscala().getValor()
                    + resposta.get(79).getEscala().getValor()+ resposta.get(99).getEscala().getValor();
        }return escalaRMais;
    }

    private int calcularEscalaRMenos() {
        int escalaRMenos = 0;
        for (int i = 0; i < resposta.size(); i++) {
            escalaRMenos = resposta.get(9).getEscala().getValor() + resposta.get(29).getEscala().getValor()
                    + resposta.get(49).getEscala().getValor() + resposta.get(54).getEscala().getValor()
                    + resposta.get(69).getEscala().getValor()+ resposta.get(89).getEscala().getValor();
        }return escalaRMenos;
    }
}

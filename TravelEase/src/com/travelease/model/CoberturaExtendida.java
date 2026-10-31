package com.travelease.model;

public class CoberturaExtendida extends ServicioAdicional {

    private int diasCobertura;

    public CoberturaExtendida(String nombre, double precio, int diasCobertura) {
        super(nombre, precio);
        this.diasCobertura = diasCobertura;
    }

    public int getDiasCobertura() {
        return diasCobertura;
    }
}

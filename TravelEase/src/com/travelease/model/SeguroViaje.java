package com.travelease.model;

public class SeguroViaje extends ServicioAdicional {

    private double cobertura;

    public SeguroViaje(String nombre, double precio, double cobertura) {
        super(nombre, precio);
        this.cobertura = cobertura;
    }

    public double getCobertura() {
        return cobertura;
    }
}

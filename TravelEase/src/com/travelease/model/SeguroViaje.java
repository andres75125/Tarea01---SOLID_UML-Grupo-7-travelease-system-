package com.travelease.model;

public class SeguroViaje extends ServicioAdicional {
    private double coberturaMonto;

    public SeguroViaje(String descripcion, double precioBase, double coberturaMonto) {
        super(descripcion, precioBase);
        this.coberturaMonto = coberturaMonto;
    }

    @Override
    public double getPrecio() {
        return precioBase;
    }

    public double getCoberturaMonto() { return coberturaMonto; }
}

package com.travelease.model;

public class CoberturaExtendida extends ServicioAdicional {
    private boolean sinDeducible;

    public CoberturaExtendida(String descripcion, double precioBase, boolean sinDeducible) {
        super(descripcion, precioBase);
        this.sinDeducible = sinDeducible;
    }

    @Override
    public double getPrecio() {
        return sinDeducible ? precioBase + 15.0 : precioBase;
    }

    public boolean isSinDeducible() { return sinDeducible; }
}

package com.travelease.model;

public abstract class ServicioAdicional {
    protected String descripcion;
    protected double precioBase;

    public ServicioAdicional(String descripcion, double precioBase) {
        this.descripcion = descripcion;
        this.precioBase = precioBase;
    }

    public abstract double getPrecio();
    public String getDescripcion() { return descripcion; }
}

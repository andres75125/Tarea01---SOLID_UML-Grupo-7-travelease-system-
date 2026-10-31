package com.travelease.model;

import com.travelease.enums.EstadoBoleto;

public class Boleto {
    private String idBoleto;
    private Vuelo vuelo;
    private String claseAsiento;
    private double precio;
    private EstadoBoleto estado;

    public Boleto(String idBoleto, Vuelo vuelo, String claseAsiento, double precio) {
        this.idBoleto = idBoleto;
        this.vuelo = vuelo;
        this.claseAsiento = claseAsiento;
        this.precio = precio;
        this.estado = EstadoBoleto.RESERVADO;
    }

    public void cancelarBoleto() {
        this.estado = EstadoBoleto.CANCELADO;
    }

    public String getIdBoleto() { return idBoleto; }
    public Vuelo getVuelo() { return vuelo; }
    public String getClaseAsiento() { return claseAsiento; }
    public double getPrecio() { return precio; }
    public EstadoBoleto getEstado() { return estado; }
    public void setEstado(EstadoBoleto estado) { this.estado = estado; }
}

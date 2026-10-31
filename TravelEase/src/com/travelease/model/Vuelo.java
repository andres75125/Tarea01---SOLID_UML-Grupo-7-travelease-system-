package com.travelease.model;

public class Vuelo {
    private String idVuelo;
    private String aerolinea;
    private String origen;
    private String destino;
    private int asientosDisponibles;
    private double precioBase;

    public Vuelo(String idVuelo, String aerolinea, String origen, String destino, int asientosDisponibles, double precioBase) {
        this.idVuelo = idVuelo;
        this.aerolinea = aerolinea;
        this.origen = origen;
        this.destino = destino;
        this.asientosDisponibles = asientosDisponibles;
        this.precioBase = precioBase;
    }

    public boolean verificarDisponibilidad() {
        return asientosDisponibles > 0;
    }

    public String getIdVuelo() { return idVuelo; }
    public String getAerolinea() { return aerolinea; }
    public String getOrigen() { return origen; }
    public String getDestino() { return destino; }
    public double getPrecioBase() { return precioBase; }
}

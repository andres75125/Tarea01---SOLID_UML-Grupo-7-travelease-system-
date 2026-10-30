package com.travelease.model;

public class AlquilerVehiculo {
    private String idAlquiler;
    private Vehiculo vehiculo;
    private int dias;

    public AlquilerVehiculo(String idAlquiler, Vehiculo vehiculo, int dias) {
        this.idAlquiler = idAlquiler;
        this.vehiculo = vehiculo;
        this.dias = dias;
    }

    public double calcularCosto() {
        return vehiculo.getPrecioPorDia() * dias;
    }

    public String getIdAlquiler() { return idAlquiler; }
    public Vehiculo getVehiculo() { return vehiculo; }
    public int getDias() { return dias; }
}

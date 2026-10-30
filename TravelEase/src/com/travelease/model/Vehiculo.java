package com.travelease.model;

import com.travelease.enums.EstadoVehiculo;

public class Vehiculo {
    private String idVehiculo;
    private String modelo;
    private String tipo;
    private double precioPorDia;
    private EstadoVehiculo estado;

    public Vehiculo(String idVehiculo, String modelo, String tipo, double precioPorDia) {
        this.idVehiculo = idVehiculo;
        this.modelo = modelo;
        this.tipo = tipo;
        this.precioPorDia = precioPorDia;
        this.estado = EstadoVehiculo.DISPONIBLE;
    }

    public String getIdVehiculo() { return idVehiculo; }
    public String getModelo() { return modelo; }
    public String getTipo() { return tipo; }
    public double getPrecioPorDia() { return precioPorDia; }
    public EstadoVehiculo getEstado() { return estado; }
    public void setEstado(EstadoVehiculo estado) { this.estado = estado; }
}

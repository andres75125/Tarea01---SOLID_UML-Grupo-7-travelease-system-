package com.travelease.model;

import com.travelease.enums.EstadoBoleto;
import com.travelease.enums.EstadoReserva;
import com.travelease.enums.EstadoVehiculo;

import java.util.ArrayList;
import java.util.List;

public class Reserva {
    private String idReserva;
    private Usuario usuario;
    private List<Boleto> boletos;
    private AlquilerVehiculo alquilerVehiculo;
    private List<ServicioAdicional> serviciosAdicionales;
    private EstadoReserva estado;

    public Reserva(String idReserva, Usuario usuario) {
        this.idReserva = idReserva;
        this.usuario = usuario;
        this.boletos = new ArrayList<>();
        this.serviciosAdicionales = new ArrayList<>();
        this.estado = EstadoReserva.PENDIENTE;
    }

    public void agregarBoleto(Boleto boleto) {
        boletos.add(boleto);
    }

    public void setAlquilerVehiculo(AlquilerVehiculo alquilerVehiculo) {
        this.alquilerVehiculo = alquilerVehiculo;
        if (alquilerVehiculo != null && alquilerVehiculo.getVehiculo() != null) {
            alquilerVehiculo.getVehiculo().setEstado(EstadoVehiculo.RESERVADO);
        }
    }

    public void agregarServicioAdicional(ServicioAdicional servicio) {
        serviciosAdicionales.add(servicio);
    }

    public double calcularMontoTotal() {
        double total = 0.0;
        for (Boleto b : boletos) {
            total += b.getPrecio();
        }
        if (alquilerVehiculo != null) {
            total += alquilerVehiculo.calcularCosto();
        }
        for (ServicioAdicional sa : serviciosAdicionales) {
            total += sa.getPrecio();
        }
        return total;
    }

    public void confirmarReserva() {
        this.estado = EstadoReserva.CONFIRMADO;
        for (Boleto b : boletos) {
            b.setEstado(EstadoBoleto.CONFIRMADO);
        }
    }

    public void cancelarReserva() {
        this.estado = EstadoReserva.CANCELADO;
        for (Boleto b : boletos) {
            b.cancelarBoleto();
        }
        if (alquilerVehiculo != null && alquilerVehiculo.getVehiculo() != null) {
            alquilerVehiculo.getVehiculo().setEstado(EstadoVehiculo.DISPONIBLE);
        }
    }

    public String getIdReserva() { return idReserva; }
    public Usuario getUsuario() { return usuario; }
    public List<Boleto> getBoletos() { return boletos; }
    public AlquilerVehiculo getAlquilerVehiculo() { return alquilerVehiculo; }
    public List<ServicioAdicional> getServiciosAdicionales() { return serviciosAdicionales; }
    public EstadoReserva getEstado() { return estado; }
}

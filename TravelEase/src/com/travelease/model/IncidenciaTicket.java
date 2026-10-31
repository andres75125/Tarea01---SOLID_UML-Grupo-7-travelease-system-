package com.travelease.model;

import com.travelease.enums.EstadoTicket;

public class IncidenciaTicket {
    private String idTicket;
    private String idReserva;
    private String detalle;
    private EstadoTicket estado;

    public IncidenciaTicket(String idTicket, String idReserva, String detalle) {
        this.idTicket = idTicket;
        this.idReserva = idReserva;
        this.detalle = detalle;
        this.estado = EstadoTicket.ABIERTO;
    }

    public void marcarEscalado() {
        this.estado = EstadoTicket.ESCALADO;
    }

    public void marcarResuelto() {
        this.estado = EstadoTicket.RESUELTO;
    }

    public String getIdTicket() { return idTicket; }
    public String getIdReserva() { return idReserva; }
    public String getDetalle() { return detalle; }
    public EstadoTicket getEstado() { return estado; }
}

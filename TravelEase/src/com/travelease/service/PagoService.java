package com.travelease.service;

import com.travelease.model.Reserva;

public class PagoService {

    public boolean procesarPago(Reserva reserva, String numeroTarjeta) {
        System.out.println(
            "  [PagoService]: Procesando cobro de $" +
            reserva.calcularMontoTotal() +
            " en tarjeta: " + numeroTarjeta
        );
        return true;
    }

    public boolean emitirReembolso(Reserva reserva) {
        System.out.println(
            "  [PagoService]: Reembolso por $" +
            reserva.calcularMontoTotal() +
            " emitido a la cuenta asociada."
        );
        return true;
    }
}

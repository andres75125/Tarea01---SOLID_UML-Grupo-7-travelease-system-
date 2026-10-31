package com.travelease.service;

import com.travelease.enums.EstadoReserva;
import com.travelease.model.Reserva;

public class ReservaService {
    private PagoService pagoService;
    private INotificador notificador;

    public ReservaService(PagoService pagoService, INotificador notificador) {
        this.pagoService = pagoService;
        this.notificador = notificador;
    }

    public boolean confirmarYPagarReserva(Reserva reserva, String tarjeta) {
        System.out.println("\n=== [CU-02] Ejecutando Reserva de Viaje Integrado ===");
        System.out.println("Iniciando procesamiento de Reserva: " + reserva.getIdReserva());
        
        boolean pagoExitoso = pagoService.procesarPago(reserva, tarjeta);
        if (pagoExitoso) {
            reserva.confirmarReserva();
            String emailCliente = reserva.getUsuario().getEmail();
            notificador.enviarNotificacion("Su reserva " + reserva.getIdReserva() + " ha sido confirmada exitosamente.", emailCliente);
            System.out.println("Reserva " + reserva.getIdReserva() + " cambiada a estado: " + reserva.getEstado());
            return true;
        }
        return false;
    }

    public boolean cancelarReserva(Reserva reserva) {
        System.out.println("\n=== [CU-03] Ejecutando Gestión de Cancelación y Reembolso ===");
        if (reserva.getEstado() == EstadoReserva.CONFIRMADO) {
            reserva.cancelarReserva();
            pagoService.emitirReembolso(reserva);
            String emailCliente = reserva.getUsuario().getEmail();
            notificador.enviarNotificacion("Su reserva " + reserva.getIdReserva() + " ha sido cancelada y el reembolso procesado.", emailCliente);
            System.out.println("Reserva " + reserva.getIdReserva() + " cambiada a estado: " + reserva.getEstado());
            return true;
        } else {
            System.out.println("La reserva no está en estado CONFIRMADO, no se puede cancelar.");
            return false;
        }
    }
}

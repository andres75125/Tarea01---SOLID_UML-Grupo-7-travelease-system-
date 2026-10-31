package com.travelease.service;

import com.travelease.model.IncidenciaTicket;

public class IncidenciaService {
    private INotificador notificador;
    private int contadorTickets = 1;

    public IncidenciaService(INotificador notificador) {
        this.notificador = notificador;
    }

    public IncidenciaTicket registrarIncidencia(String idReserva, String detalle) {
        System.out.println("\n=== [CU-04] Ejecutando Reporte de Incidencia ===");
        String idTicket = "TCK-00" + (contadorTickets++);
        IncidenciaTicket ticket = new IncidenciaTicket(idTicket, idReserva, detalle);
        System.out.println("Ticket registrado: " + ticket.getIdTicket() + " para Reserva: " + idReserva + " | Detalle: " + detalle);
        return ticket;
    }

    public void escalarAProveedor(IncidenciaTicket ticket, String emailUsuario) {
        ticket.marcarEscalado();
        System.out.println("  [Soporte Nivel 1]: No fue posible resolver internamente. Ticket " + ticket.getIdTicket() + " escalado al departamento externo.");
        notificarEscalamiento(ticket, emailUsuario);
    }

    public void resolverTicket(IncidenciaTicket ticket, String solucion, String emailUsuario) {
        ticket.marcarResuelto();
        System.out.println("  [Soporte]: Ticket " + ticket.getIdTicket() + " resuelto: " + solucion);
        notificarResolucion(ticket, solucion, emailUsuario);
    }

    private void notificarEscalamiento(IncidenciaTicket ticket, String emailUsuario) {
        if (notificador != null && emailUsuario != null) {
            notificador.enviarNotificacion("Su ticket " + ticket.getIdTicket() + " ha sido escalado al proveedor externo.", emailUsuario);
        }
    }

    private void notificarResolucion(IncidenciaTicket ticket, String solucion, String emailUsuario) {
        if (notificador != null && emailUsuario != null) {
            notificador.enviarNotificacion("Su ticket " + ticket.getIdTicket() + " fue resuelto: " + solucion, emailUsuario);
        }
    }
}

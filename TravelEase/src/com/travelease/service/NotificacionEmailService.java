package com.travelease.service;

public class NotificacionEmailService implements INotificador {
    @Override
    public void enviarNotificacion(String mensaje, String destinatario) {
        System.out.println("  [NOTIFICACION EMAIL -> " + destinatario + "]: " + mensaje);
    }
}

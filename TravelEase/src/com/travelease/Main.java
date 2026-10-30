package com.travelease;

import com.travelease.model.*;
import com.travelease.service.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("      SISTEMA TRAVELEASE - PRUEBA INTEGRAL");
        System.out.println("==================================================");

        // 0. Instanciación de Servicios Generales e Infraestructura
        ServicioVuelo servicioVuelo = new ServicioVuelo();
        ServicioVehiculo servicioVehiculo = new ServicioVehiculo();
        INotificador notificador = new NotificacionEmailService();
        PagoService pagoService = new PagoService();
        
        BusquedaService busquedaService = new BusquedaService(servicioVuelo, servicioVehiculo);
        ReservaService reservaService = new ReservaService(pagoService, notificador);
        IncidenciaService incidenciaService = new IncidenciaService(notificador);

        // 1. Demostración [CU-01]: Buscar Opciones de Viaje
        busquedaService.buscarOpciones("GYE", "UIO", "2026-11-15");

        // Datos del Usuario de prueba
        Usuario cliente = new Usuario("U001", "valeska urrutia", "valeska@gmail.com.ec");

        // 2. Demostración [CU-02]: Reservar Viaje Integrado
        Vuelo vueloAvianca = new Vuelo("V102", "Avianca", "GYE", "UIO", 10, 100.0);
        Boleto boletoEjecutivo = new Boleto("B001", vueloAvianca, "Ejecutiva", 120.0);

        Vehiculo rav4 = new Vehiculo("CAR01", "Toyota RAV4", "SUV", 45.0);
        AlquilerVehiculo alquiler3Dias = new AlquilerVehiculo("ALQ01", rav4, 3);

        Reserva reservaIntegrada = new Reserva("RES-777", cliente);
        reservaIntegrada.agregarBoleto(boletoEjecutivo);
        reservaIntegrada.setAlquilerVehiculo(alquiler3Dias);
        reservaIntegrada.agregarServicioAdicional(new SeguroViaje("Seguro Médico Internacional", 15.0, 500.0));

        // Confirmar y Pagar
        reservaService.confirmarYPagarReserva(reservaIntegrada, "4532-xxxx-xxxx-6899");

        // 3. Demostración [CU-04]: Reportar Incidencia y Escalamiento
        IncidenciaTicket ticket = incidenciaService.registrarIncidencia("RES-777", "Retraso en entrega del vehículo por parte del proveedor");
        // Simular escalamiento a proveedor externo (Nivel 2)
        incidenciaService.escalarAProveedor(ticket);

        // 4. Demostración [CU-03]: Gestionar Cancelación y Reembolso
        reservaService.cancelarReserva(reservaIntegrada);

        System.out.println("\n==================================================");
        System.out.println("   TODOS LOS CASOS DE USO EJECUTADOS CON ÉXITO");
        System.out.println("==================================================");
    }
}

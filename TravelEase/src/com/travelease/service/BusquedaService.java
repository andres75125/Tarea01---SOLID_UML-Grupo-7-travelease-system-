package com.travelease.service;

public class BusquedaService {
    private ServicioVuelo vueloServ;
    private ServicioVehiculo vehiculoServ;

    public BusquedaService(ServicioVuelo vueloServ, ServicioVehiculo vehiculoServ) {
        this.vueloServ = vueloServ;
        this.vehiculoServ = vehiculoServ;
    }

    public boolean buscarOpciones(String origen, String destino, String fecha) {
        System.out.println("\n=== [CU-01] Ejecutando Búsqueda de Opciones de Viaje ===");
        System.out.println("Buscando itinerarios para: " + origen + " -> " + destino + " el " + fecha);
        
        boolean okVuelos = vueloServ.consultarDisponibilidad();
        boolean okVehiculos = vehiculoServ.consultarDisponibilidad();

        if (okVuelos && okVehiculos) {
            System.out.println("Resultados encontrados: Vuelos y vehículos disponibles correctamente.");
            return true;
        } else {
            System.out.println("No se encontraron opciones disponibles para las fechas indicadas.");
            return false;
        }
    }
}

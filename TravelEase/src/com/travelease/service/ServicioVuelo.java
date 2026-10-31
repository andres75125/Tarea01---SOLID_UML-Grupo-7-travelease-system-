package com.travelease.service;

public class ServicioVuelo implements IServicioProveedor {

    @Override
    public boolean consultarDisponibilidad() {
        System.out.println(
            "  [ServicioVuelo]: Verificando asientos de vuelos disponibles con la aerolínea..."
        );
        return true;
    }
}

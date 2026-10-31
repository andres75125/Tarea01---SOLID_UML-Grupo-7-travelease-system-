package com.travelease.service;

public class ServicioVehiculo implements IServicioProveedor {

    @Override
    public boolean consultarDisponibilidad() {
        System.out.println(
            "  [ServicioVehiculo]: Verificando stock de autos disponibles con el proveedor..."
        );
        return true;
    }
}

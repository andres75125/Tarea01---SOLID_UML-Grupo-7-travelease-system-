package com.travelease.service;

public class ProveedorFactory implements IProveedorFactory {

    @Override
    public IServicioProveedor crearServicioVuelo() {
        return new ServicioVuelo();
    }

    @Override
    public IServicioProveedor crearServicioVehiculo() {
        return new ServicioVehiculo();
    }
}

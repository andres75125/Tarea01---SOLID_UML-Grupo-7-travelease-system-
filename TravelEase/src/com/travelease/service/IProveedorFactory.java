package com.travelease.service;

public interface IProveedorFactory {

    IServicioProveedor crearServicioVuelo();

    IServicioProveedor crearServicioVehiculo();
}

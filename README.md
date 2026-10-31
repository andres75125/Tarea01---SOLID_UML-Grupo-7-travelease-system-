# Tarea01---SOLID_UML-Grupo-7-travelease-system-
# ✈️ TravelEase - Sistema de Gestión de Viajes Integrados

Este repositorio contiene la implementación en Java y la documentación UML del sistema TravelEase, un proyecto diseñado bajo la arquitectura orientada a objetos cumpliendo de forma estricta con los Principios SOLID y patrones de diseño.

---

## 👥 Integrantes del Equipo

Andrés Martínez Gutiérrez - Integrante 1
[Nombre del Integrante 2] - Integrante 2
[Nombre del Integrante 3] - Integrante 3

---

## 🚀 Descripción del Proyecto

TravelEase es una plataforma modular que permite a los usuarios buscar itinerarios integrados (vuelos y alquiler de vehículos), procesar pagos transaccionales de reservas, gestionar solicitudes de cancelación/reembolso y reportar incidencias operativas con escalamiento de soporte.

---

## 📂 Estructura del Código Source (`src`)

```text
src/
└── com/
    └── travelease/
        ├── enums/                  # Seguridad de tipos (Type-Safety)
        │   ├── EstadoBoleto.java
        │   ├── EstadoReserva.java
        │   ├── EstadoTicket.java
        │   └── EstadoVehiculo.java
        ├── model/                  # Modelo de Dominio y Lógica de Negocio
        │   ├── AlquilerVehiculo.java
        │   ├── Boleto.java
        │   ├── CoberturaExtendida.java
        │   ├── IncidenciaTicket.java
        │   ├── Reserva.java
        │   ├── SeguroViaje.java
        │   ├── ServicioAdicional.java
        │   ├── Usuario.java
        │   ├── Vehiculo.java<img width="959" height="503" alt="Captura de pantalla 2026-10-30 042320" src="https://github.com/user-attachments/assets/15bb999c-0372-4eb7-b3dd-85d2b12d2184" />

        │   └── Vuelo.java
        ├── service/                # Capa de Servicios y Abstracciones (SOLID)
        │   ├── BusquedaService.java
        │   ├── IncidenciaService.java
        │   ├── INotificador.java
        │   ├── IServicioProveedor.java
        │   ├── NotificacionEmailService.java
        │   ├── PagoService.java
        │   ├── ReservaService.java
        │   ├── ServicioVehiculo.java
        │   └── ServicioVuelo.java
        └── Main.java               # Prueba integral del sistema (Casos de Uso)


Integrante 1

<img width="959" height="507" alt="image" src="https://github.com/user-attachments/assets/e19d5cea-593a-40f9-83ce-bae387357f60" />


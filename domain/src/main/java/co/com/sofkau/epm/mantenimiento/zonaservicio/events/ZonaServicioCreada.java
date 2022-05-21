package co.com.sofkau.epm.mantenimiento.zonaservicio.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Direccion;

public class ZonaServicioCreada extends DomainEvent {

    private final Direccion direccion;

    public ZonaServicioCreada(Direccion direccion) {
        super("co.com.sofkau.epm.mantenimiento.zonaservicio.events.ZonaServicioCreada");
        this.direccion = direccion;
    }


    public Direccion getDireccion() {
        return direccion;
    }
}

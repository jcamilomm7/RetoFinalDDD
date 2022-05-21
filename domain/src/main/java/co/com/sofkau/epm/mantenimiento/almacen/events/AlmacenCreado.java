package co.com.sofkau.epm.mantenimiento.almacen.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.epm.mantenimiento.almacen.values.Telefono;

public class AlmacenCreado extends DomainEvent {

    private final Telefono telefono;


    public AlmacenCreado(Telefono telefono) {
        super("co.com.sofkau.epm.mantenimiento.almacen.events.AlmacenCreado");
        this.telefono = telefono;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}

package co.com.sofkau.epm.mantenimiento.almacen.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.epm.mantenimiento.almacen.values.ProveedorId;
import co.com.sofkau.epm.mantenimiento.almacen.values.Telefono;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Direccion;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;

public class ProveedorAgregado extends DomainEvent {


    private final Telefono telefono;
    private final Direccion direccion;
    private final Nombre nombre;

    public ProveedorAgregado(Telefono telefono, Direccion direccion, Nombre nombre) {
        super("co.com.sofkau.epm.mantenimiento.almacen.events.proveedorAgregado");
        this.telefono = telefono;
        this.direccion = direccion;
        this.nombre = nombre;
    }


    public Telefono getTelefono() {
        return telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public Nombre getNombre() {
        return nombre;
    }
}

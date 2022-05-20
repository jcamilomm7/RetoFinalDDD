package co.com.sofkau.epm.mantenimiento.almacen.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.epm.mantenimiento.almacen.values.ProveedorId;
import co.com.sofkau.epm.mantenimiento.almacen.values.Telefono;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Direccion;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;

public class ProveedorAgregado extends DomainEvent {

    private final ProveedorId proveedorId;
    private final Telefono telefono;
    private final Direccion direccion;
    private final Nombre nombre;

    public ProveedorAgregado(ProveedorId proveedorId, Telefono telefono, Direccion direccion, Nombre nombre) {
        super("co.com.sofkau.epm.mantenimiento.almacen.events.proveedorAgregado");
        this.proveedorId = proveedorId;
        this.telefono = telefono;
        this.direccion = direccion;
        this.nombre = nombre;
    }

    public ProveedorId getProveedorId() {
        return proveedorId;
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

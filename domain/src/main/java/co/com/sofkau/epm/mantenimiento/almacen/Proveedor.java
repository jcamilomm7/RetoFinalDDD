package co.com.sofkau.epm.mantenimiento.almacen;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Direccion;
import co.com.sofkau.epm.mantenimiento.almacen.values.ProveedorId;
import co.com.sofkau.epm.mantenimiento.almacen.values.Telefono;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;

public class Proveedor extends Entity<ProveedorId> {

    protected Nombre nombre;
    protected Telefono telefono;
    protected Direccion direccion;
    public Proveedor(ProveedorId entityId, Telefono telefono, Direccion direccion, Nombre nombre) {
        super(entityId);
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}

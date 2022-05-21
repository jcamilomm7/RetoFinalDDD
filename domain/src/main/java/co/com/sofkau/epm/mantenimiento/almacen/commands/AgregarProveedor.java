package co.com.sofkau.epm.mantenimiento.almacen.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.epm.mantenimiento.almacen.values.ProveedorId;
import co.com.sofkau.epm.mantenimiento.almacen.values.Telefono;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Direccion;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;

public class AgregarProveedor extends Command {

    private ProveedorId proveedorId;
    private Telefono telefono;
    private Direccion direccion;
    private Nombre nombre;

    public AgregarProveedor(ProveedorId proveedorId, Telefono telefono, Direccion direccion, Nombre nombre) {
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

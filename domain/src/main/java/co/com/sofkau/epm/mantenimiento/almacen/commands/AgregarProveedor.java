package co.com.sofkau.epm.mantenimiento.almacen.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.epm.mantenimiento.almacen.values.AlmacenId;
import co.com.sofkau.epm.mantenimiento.almacen.values.ProveedorId;
import co.com.sofkau.epm.mantenimiento.almacen.values.Telefono;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Direccion;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;

public class AgregarProveedor extends Command {

    private AlmacenId almacenId;
    private Telefono telefono;
    private Direccion direccion;
    private Nombre nombre;


    public AgregarProveedor(AlmacenId almacenId, Telefono telefono, Direccion direccion, Nombre nombre) {
        this.almacenId = almacenId;
        this.telefono = telefono;
        this.direccion = direccion;
        this.nombre = nombre;
    }

    public AlmacenId getAlmacenId() {
        return almacenId;
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

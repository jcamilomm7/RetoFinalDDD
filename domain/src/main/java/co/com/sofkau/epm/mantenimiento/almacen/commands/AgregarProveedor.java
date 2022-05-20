package co.com.sofkau.epm.mantenimiento.almacen.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.epm.mantenimiento.almacen.values.Telefono;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Direccion;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;

public class AgregarProveedor extends Command {

    private Telefono telefono;
    private Direccion direccion;
    private Nombre nombre;

    public AgregarProveedor(Telefono telefono, Direccion direccion, Nombre nombre) {
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
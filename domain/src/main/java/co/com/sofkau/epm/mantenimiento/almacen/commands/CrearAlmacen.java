package co.com.sofkau.epm.mantenimiento.almacen.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.epm.mantenimiento.almacen.values.AlmacenId;
import co.com.sofkau.epm.mantenimiento.almacen.values.Telefono;

public class CrearAlmacen extends Command {

    private AlmacenId almacenId;
    private Telefono telefono;

    public CrearAlmacen(AlmacenId almacenId, Telefono telefono) {
        this.almacenId = almacenId;
        this.telefono = telefono;
    }

    public AlmacenId getAlmacenId() {
        return almacenId;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}

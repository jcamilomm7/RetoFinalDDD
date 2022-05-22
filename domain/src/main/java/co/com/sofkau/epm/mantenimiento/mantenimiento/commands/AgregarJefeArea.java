package co.com.sofkau.epm.mantenimiento.mantenimiento.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.epm.mantenimiento.mantenimiento.values.MantenimientoId;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;

public class AgregarJefeArea extends Command {

    private MantenimientoId mantenimientoId;
    private Nombre nombre;

    public AgregarJefeArea(MantenimientoId mantenimientoId, Nombre nombre) {
        this.mantenimientoId = mantenimientoId;
        this.nombre = nombre;
    }

    public MantenimientoId getMantenimientoId() {
        return mantenimientoId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}

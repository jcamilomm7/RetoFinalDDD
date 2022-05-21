package co.com.sofkau.epm.mantenimiento.taller.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.epm.mantenimiento.taller.values.JefetallerId;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;

public class ActualizarNombreJefeTaller extends Command {

    private  JefetallerId jefetallerId;
    private Nombre nombre;

    public ActualizarNombreJefeTaller(Nombre nombre) {
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}

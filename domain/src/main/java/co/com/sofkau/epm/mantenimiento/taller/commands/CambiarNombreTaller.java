package co.com.sofkau.epm.mantenimiento.taller.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;

public class CambiarNombreTaller extends Command {

    private Nombre nombre;

    public CambiarNombreTaller(Nombre nombre) {
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}

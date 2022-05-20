package co.com.sofkau.epm.mantenimiento.mantenimiento.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;

public class AgregarEmpleado  extends Command {

    private Nombre nombre;

    public AgregarEmpleado(Nombre nombre) {
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}

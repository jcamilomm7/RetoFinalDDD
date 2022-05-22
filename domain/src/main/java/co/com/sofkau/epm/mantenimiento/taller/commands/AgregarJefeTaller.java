package co.com.sofkau.epm.mantenimiento.taller.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.epm.mantenimiento.taller.values.TallerId;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;

public class AgregarJefeTaller extends Command {

    private TallerId tallerId;
    private Nombre nombre;

    public AgregarJefeTaller(TallerId tallerId, Nombre nombre) {
        this.tallerId = tallerId;
        this.nombre = nombre;
    }

    public TallerId getTallerId() {
        return tallerId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}

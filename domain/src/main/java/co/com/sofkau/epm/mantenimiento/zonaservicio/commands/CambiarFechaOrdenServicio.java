package co.com.sofkau.epm.mantenimiento.zonaservicio.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Fecha;

public class CambiarFechaOrdenServicio extends Command {

    private Fecha fecha;

    public CambiarFechaOrdenServicio(Fecha fecha) {
        this.fecha = fecha;
    }

    public Fecha getFecha() {
        return fecha;
    }
}

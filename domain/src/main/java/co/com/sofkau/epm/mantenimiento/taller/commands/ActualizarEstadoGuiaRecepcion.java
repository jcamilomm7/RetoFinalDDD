package co.com.sofkau.epm.mantenimiento.taller.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Estado;

public class ActualizarEstadoGuiaRecepcion extends Command {

    private Estado estado;

    public ActualizarEstadoGuiaRecepcion(Estado estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }
}

package co.com.sofkau.epm.mantenimiento.taller.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.epm.mantenimiento.taller.values.GuiaRecepcionId;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Estado;

public class ActualizarEstadoGuiaRecepcion extends Command {


    private GuiaRecepcionId guiaRecepcionId;
    private Estado estado;

    public ActualizarEstadoGuiaRecepcion(GuiaRecepcionId guiaRecepcionId, Estado estado) {
        this.guiaRecepcionId = guiaRecepcionId;
        this.estado = estado;
    }

    public GuiaRecepcionId getGuiaRecepcionId() {
        return guiaRecepcionId;
    }

    public Estado getEstado() {
        return estado;
    }
}

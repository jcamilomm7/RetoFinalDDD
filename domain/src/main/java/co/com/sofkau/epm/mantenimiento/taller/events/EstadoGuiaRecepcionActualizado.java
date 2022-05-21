package co.com.sofkau.epm.mantenimiento.taller.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.epm.mantenimiento.taller.values.GuiaRecepcionId;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Estado;

public class EstadoGuiaRecepcionActualizado extends DomainEvent {

    private final Estado estado;

    public EstadoGuiaRecepcionActualizado(GuiaRecepcionId guiaRecepcionId, Estado estado) {
        super("co.com.sofkau.epm.mantenimiento.taller.events");

        this.estado = estado;
    }


    public Estado getEstado() {
        return estado;
    }
}

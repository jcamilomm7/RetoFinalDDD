package co.com.sofkau.epm.mantenimiento.taller.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.epm.mantenimiento.taller.values.GuiaRecepcionId;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Estado;

public class GuiaRecepcionActualizada extends DomainEvent {

    private final GuiaRecepcionId guiaRecepcionId;
    private final Estado estado;

    public GuiaRecepcionActualizada(GuiaRecepcionId guiaRecepcionId, Estado estado) {
        super("co.com.sofkau.epm.mantenimiento.taller.events");
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

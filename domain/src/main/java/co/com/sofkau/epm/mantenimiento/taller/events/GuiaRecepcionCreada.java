package co.com.sofkau.epm.mantenimiento.taller.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.epm.mantenimiento.taller.values.GuiaRecepcionId;
import co.com.sofkau.epm.mantenimiento.taller.values.OrdenServicioVeh;
import co.com.sofkau.epm.mantenimiento.taller.values.Ordentrabajo;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Estado;

public class GuiaRecepcionCreada extends DomainEvent {

    private final OrdenServicioVeh ordenServicioVeh;
    private final Ordentrabajo ordentrabajo;
    private final Estado estado;

    public GuiaRecepcionCreada(GuiaRecepcionId guiaRecepcionId, OrdenServicioVeh ordenServicioVeh, Ordentrabajo ordentrabajo, Estado estado) {
        super("co.com.sofkau.epm.mantenimiento.taller.events.GuiaRecepcionCreada");
        this.ordenServicioVeh = ordenServicioVeh;
        this.ordentrabajo = ordentrabajo;
        this.estado = estado;
    }


    public OrdenServicioVeh getOrdenServicioVeh() {
        return ordenServicioVeh;
    }

    public Ordentrabajo getOrdentrabajo() {
        return ordentrabajo;
    }

    public Estado getEstado() {
        return estado;
    }
}

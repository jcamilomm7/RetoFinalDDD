package co.com.sofkau.epm.mantenimiento.zonaservicio.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Fecha;
import co.com.sofkau.epm.mantenimiento.zonaservicio.values.OrdenServicioId;

public class FechaOrdenServicioActualizada extends DomainEvent {

    private final OrdenServicioId ordenServicioId;
    private final Fecha fecha;

    public FechaOrdenServicioActualizada(OrdenServicioId ordenServicioId, Fecha fecha) {
        super("co.com.sofkau.epm.mantenimiento.zonaservicio.events.FechaOrdenServicioActualizada");
        this.ordenServicioId = ordenServicioId;
        this.fecha = fecha;
    }

    public OrdenServicioId getOrdenServicioId() {
        return ordenServicioId;
    }

    public Fecha getFecha() {
        return fecha;
    }
}

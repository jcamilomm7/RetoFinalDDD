package co.com.sofkau.epm.mantenimiento.zonaservicio.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.epm.mantenimiento.zonaservicio.OrdenServicio;
import co.com.sofkau.epm.mantenimiento.zonaservicio.values.OrdenServicioId;

import java.util.Set;

public class OrdenServicioEliminada extends DomainEvent {

    private final OrdenServicioId ordenServicioId;
    private Set<OrdenServicio> ordenServicio;

    public OrdenServicioEliminada(OrdenServicioId ordenServicioId, Set<OrdenServicio> ordenServicio) {
        super("co.com.sofkau.epm.mantenimiento.zonaservicio.events.OrdenServicioEliminada");
        this.ordenServicioId = ordenServicioId;
        this.ordenServicio = ordenServicio;
    }

    public OrdenServicioId getOrdenServicioId() {
        return ordenServicioId;
    }

    public Set<OrdenServicio> getOrdenServicio() {
        return ordenServicio;
    }
}

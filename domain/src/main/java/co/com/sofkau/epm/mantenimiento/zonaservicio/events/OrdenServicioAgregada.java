package co.com.sofkau.epm.mantenimiento.zonaservicio.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Estado;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Fecha;
import co.com.sofkau.epm.mantenimiento.zonaservicio.values.EmpleadoAsignado;
import co.com.sofkau.epm.mantenimiento.zonaservicio.values.OrdenServicioId;
import co.com.sofkau.epm.mantenimiento.zonaservicio.values.VehiculoAsignado;

import java.util.Set;

public class OrdenServicioAgregada extends DomainEvent {

    private final OrdenServicioId ordenServicioId;
    private final Fecha fecha;

    private final Estado estado;

    public OrdenServicioAgregada(OrdenServicioId ordenServicioId, Fecha fecha, Estado estado) {
        super("co.com.sofkau.epm.mantenimiento.zonaservicio.events.AlmacenCreado");
        this.ordenServicioId = ordenServicioId;
        this.fecha = fecha;
        this.estado = estado;
    }

    public OrdenServicioId getOrdenServicioId() {
        return ordenServicioId;
    }

    public Fecha getFecha() {
        return fecha;
    }


    public Estado getEstado() {
        return estado;
    }
}

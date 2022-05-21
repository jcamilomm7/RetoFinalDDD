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
    private final Set<VehiculoAsignado> vehiculoAsignado;
    private final Set<EmpleadoAsignado> empleadoAsignado;
    private final Estado estado;

    public OrdenServicioAgregada(OrdenServicioId ordenServicioId, Fecha fecha, Set<VehiculoAsignado> vehiculoAsignado, Set<EmpleadoAsignado> empleadoAsignado, Estado estado) {
        super(type);
        this.ordenServicioId = ordenServicioId;
        this.fecha = fecha;
        this.vehiculoAsignado = vehiculoAsignado;
        this.empleadoAsignado = empleadoAsignado;
        this.estado = estado;
    }

    public OrdenServicioId getOrdenServicioId() {
        return ordenServicioId;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Set<VehiculoAsignado> getVehiculoAsignado() {
        return vehiculoAsignado;
    }

    public Set<EmpleadoAsignado> getEmpleadoAsignado() {
        return empleadoAsignado;
    }

    public Estado getEstado() {
        return estado;
    }
}

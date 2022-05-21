package co.com.sofkau.epm.mantenimiento.zonaservicio;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Direccion;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Estado;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Fecha;
import co.com.sofkau.epm.mantenimiento.zonaservicio.events.OrdenServicioAgregada;
import co.com.sofkau.epm.mantenimiento.zonaservicio.events.ZonaServicioCreada;
import co.com.sofkau.epm.mantenimiento.zonaservicio.values.EmpleadoAsignado;
import co.com.sofkau.epm.mantenimiento.zonaservicio.values.OrdenServicioId;
import co.com.sofkau.epm.mantenimiento.zonaservicio.values.VehiculoAsignado;
import co.com.sofkau.epm.mantenimiento.zonaservicio.values.ZonaServicioId;

import java.util.Set;


public class ZonaServicio  extends AggregateEvent<ZonaServicioId> {

protected Set<JefeServicio> jefeServicio;
protected Set<OrdenServicio> ordenServicio;

protected Direccion direccion;


    public ZonaServicio(ZonaServicioId entityId, Direccion direccion) {
        super(entityId);
        appendChange(new ZonaServicioCreada(direccion)).apply();
        subscribe(new ZonaServicioEventChange(this));
    }
    public ZonaServicio(ZonaServicioId entityId) {
        super(entityId);
        subscribe(new ZonaServicioEventChange(this));
    }


    public void agregarOrdenServicio(Fecha fecha, Set<VehiculoAsignado> vehiculoAsignado, Set<EmpleadoAsignado> empleadoAsignado, Estado estado) {
        var ordenServicioId = new OrdenServicioId();
        appendChange(new OrdenServicioAgregada(ordenServicioId,fecha,vehiculoAsignado,empleadoAsignado,estado)).apply();
    }


    public Set<JefeServicio> getJefeServicio() {
        return jefeServicio;
    }

    public Set<OrdenServicio> getOrdenServicio() {
        return ordenServicio;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}

package co.com.sofkau.epm.mantenimiento.zonaservicio;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.epm.mantenimiento.taller.TallerEventChange;
import co.com.sofkau.epm.mantenimiento.taller.events.TallerCreado;
import co.com.sofkau.epm.mantenimiento.taller.values.TallerId;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Direccion;
import co.com.sofkau.epm.mantenimiento.zonaservicio.events.ZonaServicioCreada;
import co.com.sofkau.epm.mantenimiento.zonaservicio.values.ZonaServicioId;

import java.util.Set;


public class ZonaServicio  extends AggregateEvent<ZonaServicioId> {

protected Set<JefeServicio> jefeServicio;
protected Set<OrdenServicio> ordenServicio;

protected Direccion direccion;


    public ZonaServicio(ZonaServicioId entityId, Set<JefeServicio> jefeServicio, Set<OrdenServicio> ordenServicio, Direccion direccion) {
        super(entityId);
        appendChange(new ZonaServicioCreada(direccion)).apply();
        subscribe(new ZonaServicioEventChange(this));
    }
    public ZonaServicio(ZonaServicioId entityId) {
        super(entityId);
        subscribe(new ZonaServicioEventChange(this));
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

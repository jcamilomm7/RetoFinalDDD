package co.com.sofkau.iupb.facultad.zonaservicio;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.iupb.facultad.zonaservicio.values.ZonaServicioId;

import java.util.Set;


public class ZonaServicio  extends AggregateEvent<ZonaServicioId> {

protected JefeServicio jefeServicio;
protected Set<OrdenServicio> ordenServicio;


    public ZonaServicio(ZonaServicioId entityId) {
        super(entityId);
    }
}

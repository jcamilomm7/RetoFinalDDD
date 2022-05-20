package co.com.sofkau.epm.mantenimiento.zonaservicio;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Direccion;
import co.com.sofkau.epm.mantenimiento.zonaservicio.values.ZonaServicioId;

import java.util.Set;


public class ZonaServicio  extends AggregateEvent<ZonaServicioId> {

protected JefeServicio jefeServicio;
protected Set<OrdenServicio> ordenServicio;

protected Direccion direccion;


    public ZonaServicio(ZonaServicioId entityId) {
        super(entityId);
    }

    public JefeServicio getJefeServicio() {
        return jefeServicio;
    }

    public Set<OrdenServicio> getOrdenServicio() {
        return ordenServicio;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}

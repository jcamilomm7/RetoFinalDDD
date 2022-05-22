package co.com.sofkau.epm.mantenimiento.zonaservicio;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Direccion;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Estado;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Fecha;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;
import co.com.sofkau.epm.mantenimiento.zonaservicio.events.JefeServicioAgregado;
import co.com.sofkau.epm.mantenimiento.zonaservicio.events.OrdenServicioAgregada;
import co.com.sofkau.epm.mantenimiento.zonaservicio.events.ZonaServicioCreada;
import co.com.sofkau.epm.mantenimiento.zonaservicio.values.*;

import java.util.List;
import java.util.Set;


public class ZonaServicio  extends AggregateEvent<ZonaServicioId> {

protected Set<JefeServicio> jefeServicio;
protected Set<OrdenServicio> ordenServicio;

protected Direccion direccion;

    public ZonaServicio(ZonaServicioId zonaServicioId) {
        super(zonaServicioId);
        subscribe(new ZonaServicioEventChange(this));
    }



    public ZonaServicio(ZonaServicioId entityId,Direccion direccion) {
        super(entityId);
        appendChange(new ZonaServicioCreada(direccion)).apply();
        subscribe(new ZonaServicioEventChange(this));
    }

    public static ZonaServicio from(ZonaServicioId entityId, List<DomainEvent> events){
        var zonaServicio = new ZonaServicio(entityId);
        events.forEach(zonaServicio::applyEvent);
        return zonaServicio;
    }


    public void agregarOrdenServicio(Fecha fecha, Estado estado) {
        var ordenServicioId = new OrdenServicioId();
        appendChange(new OrdenServicioAgregada(ordenServicioId,fecha,estado)).apply();
    }

    public void agregarJefeServicio(Nombre nombre) {
        var jefeServicioId = new JefeServicioId();
        appendChange(new JefeServicioAgregado(jefeServicioId,nombre)).apply();
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

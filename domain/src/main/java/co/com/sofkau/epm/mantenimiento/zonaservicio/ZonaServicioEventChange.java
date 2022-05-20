package co.com.sofkau.epm.mantenimiento.zonaservicio;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.epm.mantenimiento.zonaservicio.events.OrdenServicioAgregada;

import java.util.Set;

public class ZonaServicioEventChange extends EventChange {

    public ZonaServicioEventChange(ZonaServicio zonaServicio) {

        apply((OrdenServicioAgregada event)->{
            var ordenServicioId = event.getOrdenServicioId();
            var ordenServicio =new OrdenServicio(ordenServicioId, event.getFecha(),event.getVehiculoAsignado(),event.getEmpleadoAsignado(),event.getEstado());
            zonaServicio.ordenServicio = (Set<OrdenServicio>) ordenServicio;
        });
    }
}

package co.com.sofkau.epm.mantenimiento.zonaservicio;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.epm.mantenimiento.zonaservicio.events.JefeServicioAgregado;
import co.com.sofkau.epm.mantenimiento.zonaservicio.events.OrdenServicioAgregada;
import co.com.sofkau.epm.mantenimiento.zonaservicio.events.ZonaServicioCreada;

import java.util.HashSet;
import java.util.Set;

public class ZonaServicioEventChange extends EventChange {

    public ZonaServicioEventChange(ZonaServicio zonaServicio) {

        apply((ZonaServicioCreada event) -> {
            zonaServicio.direccion = event.getDireccion(); //Objeto valor
            zonaServicio.jefeServicio = new HashSet<>(); //Entidad
            zonaServicio.ordenServicio= new HashSet<>();
        });

        apply((OrdenServicioAgregada event)->{
            var ordenServicioId = event.getOrdenServicioId();
            var ordenServicio =new OrdenServicio(ordenServicioId, event.getFecha(),event.getEstado());
            zonaServicio.ordenServicio = (Set<OrdenServicio>) ordenServicio;
        });

        apply((JefeServicioAgregado event)->{
            var jefeServicioId = event.getJefeServicioId();
            var jefeServicio =new JefeServicio(jefeServicioId, event.getNombre());
            zonaServicio.jefeServicio = (Set<JefeServicio>) jefeServicio;
        });


    }
}

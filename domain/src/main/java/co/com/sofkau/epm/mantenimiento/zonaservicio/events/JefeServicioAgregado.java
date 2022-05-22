package co.com.sofkau.epm.mantenimiento.zonaservicio.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;
import co.com.sofkau.epm.mantenimiento.zonaservicio.values.JefeServicioId;

public class JefeServicioAgregado  extends DomainEvent {

    private  final JefeServicioId jefeServicioId;
    private final Nombre nombre;

    public JefeServicioAgregado(JefeServicioId jefeServicioId, Nombre nombre) {
        super("co.com.sofkau.epm.mantenimiento.zonaservicio.events");
        this.jefeServicioId = jefeServicioId;
        this.nombre = nombre;
    }

    public JefeServicioId getJefeServicioId() {
        return jefeServicioId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}

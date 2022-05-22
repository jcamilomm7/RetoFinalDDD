package co.com.sofkau.epm.mantenimiento.mantenimiento.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.epm.mantenimiento.mantenimiento.values.JefeAreaId;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;

public class JefeAreaAgregado extends DomainEvent {

    private final JefeAreaId jefeAreaId;
    private final Nombre nombre;

    public JefeAreaAgregado(JefeAreaId jefeAreaId, Nombre nombre) {
        super("co.com.sofkau.epm.mantenimiento.mantenimiento.events.JefeAreaAgregado");
        this.jefeAreaId = jefeAreaId;
        this.nombre = nombre;
    }

    public JefeAreaId getJefeAreaId() {
        return jefeAreaId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}

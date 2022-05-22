package co.com.sofkau.epm.mantenimiento.taller.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.epm.mantenimiento.taller.values.JefetallerId;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;

public class JefeTallerAgregado extends DomainEvent {

    private final JefetallerId jefetallerId;
    private final Nombre nombre;

    public JefeTallerAgregado(JefetallerId jefetallerId, Nombre nombre) {
        super("co.com.sofkau.epm.mantenimiento.taller.events.JefeTallerAgregado");
        this.jefetallerId = jefetallerId;
        this.nombre = nombre;
    }

    public JefetallerId getJefetallerId() {
        return jefetallerId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}

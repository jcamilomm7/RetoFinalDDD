package co.com.sofkau.epm.mantenimiento.taller.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.epm.mantenimiento.taller.values.JefetallerId;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;

public class NombreJefeTallerActualizado extends DomainEvent {


    private  final Nombre nombre;

    public NombreJefeTallerActualizado(JefetallerId jefetallerId, Nombre nombre) {
        super("co.com.sofkau.epm.mantenimiento.taller.events.NombreJefeTallerActualizado");
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

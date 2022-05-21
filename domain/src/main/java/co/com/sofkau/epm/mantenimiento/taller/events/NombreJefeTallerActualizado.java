package co.com.sofkau.epm.mantenimiento.taller.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.epm.mantenimiento.taller.values.JefetallerId;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;

public class NombreJefeTallerActualizado extends DomainEvent {


    private  final Nombre nombre;

    public NombreJefeTallerActualizado(Nombre nombre) {
        super("co.com.sofkau.epm.mantenimiento.taller.events.NombreJefeTallerActualizado");
        this.nombre = nombre;
    }


    public Nombre getNombre() {
        return nombre;
    }
}

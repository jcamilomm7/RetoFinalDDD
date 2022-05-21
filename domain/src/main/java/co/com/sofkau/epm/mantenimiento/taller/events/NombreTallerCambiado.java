package co.com.sofkau.epm.mantenimiento.taller.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;

public class NombreTallerCambiado extends DomainEvent {

    private final Nombre nombre;

    public NombreTallerCambiado(Nombre nombre) {
        super("co.com.sofkau.epm.mantenimiento.taller.events.NombretallerCambiado");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}

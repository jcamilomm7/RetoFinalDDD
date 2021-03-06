package co.com.sofkau.epm.mantenimiento.taller;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.epm.mantenimiento.taller.values.JefetallerId;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;

public class Jefetaller extends Entity<JefetallerId> {

    protected Nombre nombre;

    public Jefetaller(JefetallerId entityId, Nombre nombre) {
        super(entityId);
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}

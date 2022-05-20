package co.com.sofkau.epm.mantenimiento.taller;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.epm.mantenimiento.almacen.values.AlmacenId;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;
import co.com.sofkau.epm.mantenimiento.taller.values.TallerId;

import java.util.Set;


public class Taller  extends AggregateEvent<TallerId> {

    protected AlmacenId alamcenId;
    protected Jefetaller jefeTaller;
    protected Set<PersonalOperativo> personalOperativo;
    protected  Set<GuiaRecepcion> guiaRecepcion;
    protected Nombre nombre;

    public Taller(TallerId entityId) {
        super(entityId);
    }

    public AlmacenId getAlamcenId() {
        return alamcenId;
    }

    public Jefetaller getJefeTaller() {
        return jefeTaller;
    }

    public Set<PersonalOperativo> getPersonalOperativo() {
        return personalOperativo;
    }

    public Set<GuiaRecepcion> getGuiaRecepcion() {
        return guiaRecepcion;
    }

    public Nombre getNombre() {
        return nombre;
    }
}

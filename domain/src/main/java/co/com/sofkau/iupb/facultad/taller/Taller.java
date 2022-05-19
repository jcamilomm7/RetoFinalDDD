package co.com.sofkau.iupb.facultad.taller;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.iupb.facultad.almacen.values.AlmacenId;
import co.com.sofkau.iupb.facultad.taller.values.Nombre;
import co.com.sofkau.iupb.facultad.taller.values.TallerId;

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
}

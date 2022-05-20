package co.com.sofkau.epm.mantenimiento.mantenimiento.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.epm.mantenimiento.almacen.values.AlmacenId;
import co.com.sofkau.epm.mantenimiento.taller.GuiaRecepcion;
import co.com.sofkau.epm.mantenimiento.taller.Jefetaller;
import co.com.sofkau.epm.mantenimiento.taller.PersonalOperativo;
import co.com.sofkau.epm.mantenimiento.taller.values.TallerId;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;

import java.util.Set;

public class TallerAgregado extends DomainEvent {

    private final TallerId tallerId;
    private final AlmacenId almacenId;
    private final Jefetaller jefetaller;
    private final Set<PersonalOperativo> personalOperativo;
    private final Set<GuiaRecepcion> guiaRecepcion;
    private final Nombre nombre;

    public TallerAgregado(TallerId tallerId, AlmacenId almacenId, Jefetaller jefetaller, Set<PersonalOperativo> personalOperativo, Set<GuiaRecepcion> guiaRecepcion, Nombre nombre) {
        super("co.com.sofkau.epm.mantenimiento.mantenimiento.events.TallerAgregado");
        this.tallerId = tallerId;
        this.almacenId = almacenId;
        this.jefetaller = jefetaller;
        this.personalOperativo = personalOperativo;
        this.guiaRecepcion = guiaRecepcion;
        this.nombre = nombre;
    }

    public TallerId getTallerId() {
        return tallerId;
    }

    public AlmacenId getAlmacenId() {
        return almacenId;
    }

    public Jefetaller getJefetaller() {
        return jefetaller;
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

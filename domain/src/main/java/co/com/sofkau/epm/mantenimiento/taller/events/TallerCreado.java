package co.com.sofkau.epm.mantenimiento.taller.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.epm.mantenimiento.almacen.values.AlmacenId;
import co.com.sofkau.epm.mantenimiento.taller.GuiaRecepcion;
import co.com.sofkau.epm.mantenimiento.taller.Jefetaller;
import co.com.sofkau.epm.mantenimiento.taller.PersonalOperativo;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;

import java.util.Set;

public class TallerCreado extends DomainEvent {

    private final Nombre nombre;
    private  final AlmacenId almacenId;

    public TallerCreado(Nombre nombre, AlmacenId almacenId) {
        super("co.com.sofkau.epm.mantenimiento.taller.events.TallerCreado");
        this.nombre = nombre;
        this.almacenId = almacenId;

    }

    public Nombre getNombre() {
        return nombre;
    }

    public AlmacenId getAlmacenId() {
        return almacenId;
    }


}

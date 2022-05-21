package co.com.sofkau.epm.mantenimiento.taller;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.epm.mantenimiento.almacen.values.AlmacenId;
import co.com.sofkau.epm.mantenimiento.taller.events.EstadoGuiaRecepcionActualizado;
import co.com.sofkau.epm.mantenimiento.taller.events.GuiaRecepcionCreada;
import co.com.sofkau.epm.mantenimiento.taller.events.NombreTallerCambiado;
import co.com.sofkau.epm.mantenimiento.taller.events.TallerCreado;
import co.com.sofkau.epm.mantenimiento.taller.values.GuiaRecepcionId;
import co.com.sofkau.epm.mantenimiento.taller.values.OrdenServicioVeh;
import co.com.sofkau.epm.mantenimiento.taller.values.Ordentrabajo;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Estado;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;
import co.com.sofkau.epm.mantenimiento.taller.values.TallerId;

import java.util.Set;


public class Taller  extends AggregateEvent<TallerId> {

    protected AlmacenId alamacenId;
    protected Set<Jefetaller> jefeTaller;
    protected Set<PersonalOperativo> personalOperativo;
    protected  Set<GuiaRecepcion> guiaRecepcion;
    protected Nombre nombre;


    //Este ya quedo listo
    public Taller(TallerId tallerId,Nombre nombre, AlmacenId almacenId,Jefetaller jefetaller) {
        super(tallerId);
        appendChange(new TallerCreado(nombre, almacenId)).apply();
        subscribe(new TallerEventChange(this));
    }

    public Taller(TallerId entityId) {
        super(entityId);
        subscribe(new TallerEventChange(this));
    }

    //Agregar entidad a un set dentro de este agregado
public void crearGuiaRecepcion(OrdenServicioVeh ordenServicioVeh, Ordentrabajo ordentrabajo, Estado estado) {
        var guiaRecepcionId = new GuiaRecepcionId();
        appendChange(new GuiaRecepcionCreada(guiaRecepcionId,ordenServicioVeh,ordentrabajo,estado)).apply();
}

    public void cambiarNombretaller(Nombre nombre){
        appendChange(new NombreTallerCambiado(nombre)).apply();
    }


    public AlmacenId getAlamacenId() {
        return alamacenId;
    }

    public Set<Jefetaller> getJefeTaller() {
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

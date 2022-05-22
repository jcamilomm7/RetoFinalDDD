package co.com.sofkau.epm.mantenimiento.taller;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.epm.mantenimiento.taller.events.*;

import java.util.HashSet;
import java.util.Set;


public class TallerEventChange extends EventChange {

    public TallerEventChange(Taller taller) {
        apply((TallerCreado event) -> {
            taller.nombre = event.getNombre(); //Objeto valor
            taller.alamacenId = event.getAlmacenId();
            taller.jefeTaller = new HashSet<>(); //Entidad
            taller.guiaRecepcion = new HashSet<>();
            taller.personalOperativo = new HashSet<>();
        });

        apply((GuiaRecepcionCreada event)->{
            var guiaRecepcionId = event.getGuiaRecepcionId();
            var guiaRecepcion = new GuiaRecepcion(guiaRecepcionId, event.getOrdenServicioVeh(), event.getOrdentrabajo(),event.getEstado());
            taller.guiaRecepcion = (Set<GuiaRecepcion>) guiaRecepcion;
            
        });

        apply((PersonalOperativoAgregado event)->{
            var personalOperativoId = event.getPersonalOperativoId();
            var personaloperativo = new PersonalOperativo(personalOperativoId, event.getNombre(), event.getHabilidadTecnica());
            taller.personalOperativo = (Set<PersonalOperativo>) personaloperativo;

        });

        apply((JefeTallerAgregado event)->{
            var jefeTallerId = event.getJefetallerId();
            var jefeTaller = new Jefetaller(jefeTallerId, event.getNombre());
            taller.jefeTaller= (Set<Jefetaller>) jefeTaller;

        });

        apply((NombreTallerCambiado event) -> {
            taller.nombre = event.getNombre();
        });


    }
}

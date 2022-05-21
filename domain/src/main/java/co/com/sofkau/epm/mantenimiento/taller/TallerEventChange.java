package co.com.sofkau.epm.mantenimiento.taller;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.epm.mantenimiento.taller.events.TallerCreado;
import co.com.sofkau.epm.mantenimiento.taller.values.JefetallerId;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;

import java.util.HashMap;
import java.util.HashSet;


public class TallerEventChange extends EventChange {

    public TallerEventChange(Taller taller) {
        apply((TallerCreado event) -> {
            taller.nombre = event.getNombre(); //Objeto valor
            taller.alamacenId = event.getAlmacenId();
            taller.jefeTaller = new HashSet<>(); //Entidad
            taller.guiaRecepcion = new HashSet<>();
            taller.personalOperativo = new HashSet<>();
        });


    }
}

package co.com.sofkau.epm.mantenimiento.mantenimiento.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.epm.mantenimiento.almacen.values.AlmacenId;
import co.com.sofkau.epm.mantenimiento.taller.GuiaRecepcion;
import co.com.sofkau.epm.mantenimiento.taller.Jefetaller;
import co.com.sofkau.epm.mantenimiento.taller.PersonalOperativo;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;

import java.util.Set;

public class AgregarTaller  extends Command {

    private AlmacenId almacenId;
    private Jefetaller jefetaller;
    private Set<PersonalOperativo> personalOperativo;
    private Set<GuiaRecepcion> guiaRecepcion;
    private Nombre nombre;

    public AgregarTaller(AlmacenId almacenId, Jefetaller jefetaller, Set<PersonalOperativo> personalOperativo, Set<GuiaRecepcion> guiaRecepcion, Nombre nombre) {
        this.almacenId = almacenId;
        this.jefetaller = jefetaller;
        this.personalOperativo = personalOperativo;
        this.guiaRecepcion = guiaRecepcion;
        this.nombre = nombre;
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

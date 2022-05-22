package co.com.sofkau.epm.mantenimiento.taller.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.epm.mantenimiento.taller.values.HabilidadTecnica;
import co.com.sofkau.epm.mantenimiento.taller.values.PersonalOperativoId;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;

public class PersonalOperativoAgregado extends DomainEvent {

    private final PersonalOperativoId personalOperativoId;
    private final Nombre nombre;
    private final HabilidadTecnica habilidadTecnica;

    public PersonalOperativoAgregado(PersonalOperativoId personalOperativoId, Nombre nombre, HabilidadTecnica habilidadTecnica) {
        super("co.com.sofkau.epm.mantenimiento.taller.events.PersonalOperativoAgregado");
        this.personalOperativoId = personalOperativoId;
        this.nombre = nombre;
        this.habilidadTecnica = habilidadTecnica;
    }

    public PersonalOperativoId getPersonalOperativoId() {
        return personalOperativoId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public HabilidadTecnica getHabilidadTecnica() {
        return habilidadTecnica;
    }
}

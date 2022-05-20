package co.com.sofkau.epm.mantenimiento.taller;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.epm.mantenimiento.taller.values.PersonalOperativoId;
import co.com.sofkau.epm.mantenimiento.taller.values.HabilidadTecnica;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;

public class PersonalOperativo extends Entity<PersonalOperativoId> {

    protected Nombre nombre;
    protected HabilidadTecnica habilidadTecnica;
    public PersonalOperativo(PersonalOperativoId entityId) {
        super(entityId);
    }

    public Nombre getNombre() {
        return nombre;
    }

    public HabilidadTecnica getHabilidadTecnica() {
        return habilidadTecnica;
    }
}

package co.com.sofkau.epm.mantenimiento.taller.values;

import co.com.sofka.domain.generic.Identity;

public class PersonalOperativoId extends Identity {
    public PersonalOperativoId(String id) {
        super(id);
    }

    public PersonalOperativoId() {
    }

    public static PersonalOperativoId of(String id) {
        return new PersonalOperativoId(id);
    }
}

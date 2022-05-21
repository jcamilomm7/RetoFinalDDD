package co.com.sofkau.epm.mantenimiento.mantenimiento.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofkau.epm.mantenimiento.taller.values.PersonalOperativoId;

public class EmpleadoId extends Identity {
    public EmpleadoId(String id) {
        super(id);
    }

    public static EmpleadoId of(String id) {
        return new EmpleadoId(id);
    }
}

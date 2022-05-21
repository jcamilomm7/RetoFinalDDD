package co.com.sofkau.epm.mantenimiento.mantenimiento.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofkau.epm.mantenimiento.taller.values.PersonalOperativoId;

public class EmpleadoId extends Identity {
    public EmpleadoId(String value) {
        super(value);
    }

    public EmpleadoId(){

    }

    public static EmpleadoId of(String value) {
        return new EmpleadoId(value);
    }
}

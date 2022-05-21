package co.com.sofkau.epm.mantenimiento.taller.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofkau.epm.mantenimiento.zonaservicio.values.OrdenServicioId;

public class GuiaRecepcionId extends Identity {
    public GuiaRecepcionId(String value) {
        super(value);
    }

    public GuiaRecepcionId(){

    }


    public static GuiaRecepcionId of(String value) {
        return new GuiaRecepcionId(value);
    }

}

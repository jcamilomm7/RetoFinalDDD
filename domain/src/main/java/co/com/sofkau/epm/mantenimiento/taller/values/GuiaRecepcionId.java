package co.com.sofkau.epm.mantenimiento.taller.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofkau.epm.mantenimiento.zonaservicio.values.OrdenServicioId;

public class GuiaRecepcionId extends Identity {
    public GuiaRecepcionId(String id) {
        super(id);
    }

    public static GuiaRecepcionId of(String id) {
        return new GuiaRecepcionId(id);
    }

}

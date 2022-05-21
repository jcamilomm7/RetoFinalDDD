package co.com.sofkau.epm.mantenimiento.zonaservicio.values;

import co.com.sofka.domain.generic.Identity;

public class OrdenServicioId extends Identity {
    public OrdenServicioId(String id) {
        super(id);
    }

    public static OrdenServicioId of(String id) {
        return new OrdenServicioId(id);
    }
}

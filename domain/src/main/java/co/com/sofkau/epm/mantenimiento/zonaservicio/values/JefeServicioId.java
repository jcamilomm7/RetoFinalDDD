package co.com.sofkau.epm.mantenimiento.zonaservicio.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofkau.epm.mantenimiento.taller.values.JefetallerId;

public class JefeServicioId extends Identity {
    public JefeServicioId(String id) {
        super(id);
    }

    public static JefeServicioId of(String id) {
        return new JefeServicioId(id);
    }
}

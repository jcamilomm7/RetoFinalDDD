package co.com.sofkau.epm.mantenimiento.zonaservicio.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofkau.epm.mantenimiento.mantenimiento.values.MantenimientoId;

public class ZonaServicioId extends Identity {
    public ZonaServicioId(String id) {
        super(id);
    }

    public static ZonaServicioId of(String id) {
        return new ZonaServicioId(id);
    }
}

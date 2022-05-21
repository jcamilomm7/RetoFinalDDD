package co.com.sofkau.epm.mantenimiento.mantenimiento.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofkau.epm.mantenimiento.taller.values.TallerId;

public class MantenimientoId  extends Identity {

    public MantenimientoId(String id) {
        super(id);
    }

    public MantenimientoId() {
    }

    public static MantenimientoId of(String id) {
        return new MantenimientoId(id);
    }
}

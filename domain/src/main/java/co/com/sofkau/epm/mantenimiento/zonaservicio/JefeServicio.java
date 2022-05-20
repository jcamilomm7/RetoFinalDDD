package co.com.sofkau.epm.mantenimiento.zonaservicio;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.epm.mantenimiento.zonaservicio.values.JefeServicioId;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;


public class JefeServicio extends Entity<JefeServicioId> {
    protected Nombre nombre;
    public JefeServicio(JefeServicioId entityId) {
        super(entityId);
    }

    public Nombre getNombre() {
        return nombre;
    }
}

package co.com.sofkau.epm.mantenimiento.zonaservicio;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.epm.mantenimiento.zonaservicio.values.JefeServicioId;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;


public class JefeServicio extends Entity<JefeServicioId> {
    protected Nombre nombre;

    public JefeServicio(JefeServicioId entityId, Nombre nombre) {
        super(entityId);
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}

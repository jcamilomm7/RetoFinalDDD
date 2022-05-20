package co.com.sofkau.epm.mantenimiento.mantenimiento;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.epm.mantenimiento.mantenimiento.values.JefeAreaId;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;

public class JefeArea  extends Entity<JefeAreaId> {

    protected Nombre nombre;

    public JefeArea(JefeAreaId entityId) {
        super(entityId);
    }

    public Nombre getNombre() {
        return nombre;
    }
}

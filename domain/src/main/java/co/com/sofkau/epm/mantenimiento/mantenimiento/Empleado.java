package co.com.sofkau.epm.mantenimiento.mantenimiento;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.epm.mantenimiento.mantenimiento.values.EmpleadoId;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;

public class Empleado extends Entity<EmpleadoId> {

    protected Nombre nombre;
    public Empleado(EmpleadoId entityId) {
        super(entityId);
    }

    public Nombre getNombre() {
        return nombre;
    }
}

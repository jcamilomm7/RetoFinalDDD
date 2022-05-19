package co.com.sofkau.iupb.facultad.mantenimiento;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.iupb.facultad.mantenimiento.values.EmpleadoId;

public class Empleado extends Entity<EmpleadoId> {
    public Empleado(EmpleadoId entityId) {
        super(entityId);
    }
}

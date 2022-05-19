package co.com.sofkau.iupb.facultad.mantenimiento;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.iupb.facultad.mantenimiento.values.VehiculoId;

public class Vehiculo extends Entity<VehiculoId> {
    public Vehiculo(VehiculoId entityId) {
        super(entityId);
    }
}

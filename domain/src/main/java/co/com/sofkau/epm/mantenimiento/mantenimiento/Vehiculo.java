package co.com.sofkau.epm.mantenimiento.mantenimiento;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.epm.mantenimiento.mantenimiento.values.PlanillaMantenimiento;
import co.com.sofkau.epm.mantenimiento.mantenimiento.values.Tipo;
import co.com.sofkau.epm.mantenimiento.mantenimiento.values.VehiculoId;

public class Vehiculo extends Entity<VehiculoId> {

    protected Tipo tipo;
    protected PlanillaMantenimiento planillaMantenimiento;

    public Vehiculo(VehiculoId entityId, Tipo tipo, PlanillaMantenimiento planillaMantenimiento) {
        super(entityId);
    }

    public Tipo getTipo() {
        return tipo;
    }

    public PlanillaMantenimiento getPlanillaMantenimiento() {
        return planillaMantenimiento;
    }
}

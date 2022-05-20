package co.com.sofkau.epm.mantenimiento.mantenimiento.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.epm.mantenimiento.mantenimiento.values.PlanillaMantenimiento;
import co.com.sofkau.epm.mantenimiento.mantenimiento.values.Tipo;
import co.com.sofkau.epm.mantenimiento.mantenimiento.values.VehiculoId;

public class VehiculoAgregado  extends DomainEvent {

    private final VehiculoId vehiculoId;
    private final Tipo tipo;
    private final PlanillaMantenimiento planillaMantenimiento;

    public VehiculoAgregado(VehiculoId vehiculoId, Tipo tipo, PlanillaMantenimiento planillaMantenimiento) {
        super("co.com.sofkau.epm.mantenimiento.mantenimiento.events.VehiculoAgregado");
        this.vehiculoId = vehiculoId;
        this.tipo = tipo;
        this.planillaMantenimiento = planillaMantenimiento;
    }

    public VehiculoId getVehiculoId() {
        return vehiculoId;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public PlanillaMantenimiento getPlanillaMantenimiento() {
        return planillaMantenimiento;
    }
}

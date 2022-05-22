package co.com.sofkau.epm.mantenimiento.mantenimiento.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.epm.mantenimiento.mantenimiento.values.MantenimientoId;
import co.com.sofkau.epm.mantenimiento.mantenimiento.values.PlanillaMantenimiento;
import co.com.sofkau.epm.mantenimiento.mantenimiento.values.Tipo;

public class AgregarVehiculo extends Command {

    private MantenimientoId mantenimientoId;
    private Tipo tipo;
    private PlanillaMantenimiento planillaMantenimiento;

    public AgregarVehiculo(MantenimientoId mantenimientoId, Tipo tipo, PlanillaMantenimiento planillaMantenimiento) {
        this.mantenimientoId = mantenimientoId;
        this.tipo = tipo;
        this.planillaMantenimiento = planillaMantenimiento;
    }

    public MantenimientoId getMantenimientoId() {
        return mantenimientoId;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public PlanillaMantenimiento getPlanillaMantenimiento() {
        return planillaMantenimiento;
    }
}

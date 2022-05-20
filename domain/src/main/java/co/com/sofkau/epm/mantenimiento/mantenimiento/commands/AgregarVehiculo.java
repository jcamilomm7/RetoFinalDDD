package co.com.sofkau.epm.mantenimiento.mantenimiento.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.epm.mantenimiento.mantenimiento.values.PlanillaMantenimiento;
import co.com.sofkau.epm.mantenimiento.mantenimiento.values.Tipo;

public class AgregarVehiculo extends Command {

    private Tipo tipo;
    private PlanillaMantenimiento planillaMantenimiento;

    public AgregarVehiculo(Tipo tipo, PlanillaMantenimiento planillaMantenimiento) {
        this.tipo = tipo;
        this.planillaMantenimiento = planillaMantenimiento;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public PlanillaMantenimiento getPlanillaMantenimiento() {
        return planillaMantenimiento;
    }
}

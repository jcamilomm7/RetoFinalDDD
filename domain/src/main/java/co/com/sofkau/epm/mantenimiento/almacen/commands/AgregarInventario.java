package co.com.sofkau.epm.mantenimiento.almacen.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.epm.mantenimiento.almacen.values.InventarioId;
import co.com.sofkau.epm.mantenimiento.almacen.values.Planilla;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Observaciones;

public class AgregarInventario extends Command {

    private  InventarioId inventarioId;
    private Observaciones observaciones;
    private Planilla planilla;

    public AgregarInventario(InventarioId inventarioId, Observaciones observaciones, Planilla planilla) {
        this.inventarioId = inventarioId;
        this.observaciones = observaciones;
        this.planilla = planilla;
    }

    public Observaciones getObservaciones() {
        return observaciones;
    }

    public Planilla getPlanilla() {
        return planilla;
    }

    public InventarioId getInventarioId() {
        return inventarioId;
    }
}

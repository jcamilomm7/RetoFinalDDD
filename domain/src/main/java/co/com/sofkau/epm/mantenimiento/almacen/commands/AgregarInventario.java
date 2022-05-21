package co.com.sofkau.epm.mantenimiento.almacen.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.epm.mantenimiento.almacen.values.AlmacenId;
import co.com.sofkau.epm.mantenimiento.almacen.values.InventarioId;
import co.com.sofkau.epm.mantenimiento.almacen.values.Planilla;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Observaciones;

public class AgregarInventario extends Command {

    private AlmacenId almacenId;
    private Observaciones observaciones;
    private Planilla planilla;


    public AgregarInventario(AlmacenId almacenId, Observaciones observaciones, Planilla planilla) {
        this.almacenId = almacenId;
        this.observaciones = observaciones;
        this.planilla = planilla;
    }

    public Observaciones getObservaciones() {
        return observaciones;
    }

    public Planilla getPlanilla() {
        return planilla;
    }

    public AlmacenId getAlmacenId() {
        return almacenId;
    }
}

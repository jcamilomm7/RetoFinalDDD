package co.com.sofkau.epm.mantenimiento.almacen;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.epm.mantenimiento.almacen.values.InventarioId;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Observaciones;
import co.com.sofkau.epm.mantenimiento.almacen.values.Planilla;

public class Inventario extends Entity<InventarioId> {

    //Atributos
    protected Observaciones observaciones;
    protected Planilla planilla;

    public Inventario(InventarioId entityId, Observaciones observaciones, Planilla planilla) {
        super(entityId);
        this.observaciones = observaciones;
        this.planilla = planilla;
    }

    public Observaciones getObservaciones() {
        return observaciones;
    }

    public Planilla getPlanilla() {
        return planilla;
    }
}

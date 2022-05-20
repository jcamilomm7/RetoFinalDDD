package co.com.sofkau.epm.mantenimiento.almacen.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.epm.mantenimiento.almacen.values.InventarioId;
import co.com.sofkau.epm.mantenimiento.almacen.values.Planilla;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Observaciones;

public class InventarioAgregado extends DomainEvent {

    private  final InventarioId inventarioId;
    private final Observaciones observaciones;
    private final Planilla planilla;

    public InventarioAgregado(InventarioId inventarioId, Observaciones observaciones, Planilla planilla) {
        super("co.com.sofkau.epm.mantenimiento.almacen.events.InvetarioAgregado");
        this.inventarioId = inventarioId;
        this.observaciones = observaciones;
        this.planilla = planilla;
    }

    public InventarioId getInventarioId() {
        return inventarioId;
    }

    public Observaciones getObservaciones() {
        return observaciones;
    }

    public Planilla getPlanilla() {
        return planilla;
    }
}

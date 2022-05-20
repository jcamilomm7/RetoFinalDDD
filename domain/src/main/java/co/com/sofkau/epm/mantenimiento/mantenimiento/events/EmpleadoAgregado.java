package co.com.sofkau.epm.mantenimiento.mantenimiento.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.epm.mantenimiento.mantenimiento.values.EmpleadoId;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;

public class EmpleadoAgregado extends DomainEvent {

    private final EmpleadoId empleadoId;
    private final Nombre nombre;

    public EmpleadoAgregado(EmpleadoId empleadoId, Nombre nombre) {
        super("co.com.sofkau.epm.mantenimiento.mantenimiento.events.EmpleadoAgregado");
        this.empleadoId = empleadoId;
        this.nombre = nombre;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}

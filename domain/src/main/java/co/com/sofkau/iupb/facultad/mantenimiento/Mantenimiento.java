package co.com.sofkau.iupb.facultad.mantenimiento;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.iupb.facultad.mantenimiento.values.MantenimientoId;
import co.com.sofkau.iupb.facultad.taller.values.TallerId;
import co.com.sofkau.iupb.facultad.zonaservicio.values.ZonaServicioId;

import java.util.Set;

public class Mantenimiento extends AggregateEvent<MantenimientoId> {

    protected  Set<TallerId> tallerId;
    protected Set<ZonaServicioId> zonaServicioIdSet;
    protected  JefeArea jefeArea;
    protected  Set<Empleado> empleado;
    protected  Set<Vehiculo> vehiculo;

    public Mantenimiento(MantenimientoId entityId) {
        super(entityId);
    }
}

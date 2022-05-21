package co.com.sofkau.epm.mantenimiento.mantenimiento;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.epm.mantenimiento.mantenimiento.events.MantenimientoCreado;
import co.com.sofkau.epm.mantenimiento.mantenimiento.values.MantenimientoId;
import co.com.sofkau.epm.mantenimiento.mantenimiento.values.Municipio;
import co.com.sofkau.epm.mantenimiento.taller.TallerEventChange;
import co.com.sofkau.epm.mantenimiento.taller.events.TallerCreado;
import co.com.sofkau.epm.mantenimiento.taller.values.TallerId;
import co.com.sofkau.epm.mantenimiento.zonaservicio.values.ZonaServicioId;

import java.util.Set;

public class Mantenimiento extends AggregateEvent<MantenimientoId> {

    protected  Set<TallerId> tallerId;
    protected Set<ZonaServicioId> zonaServicioId;
    protected  Set<JefeArea> jefeArea;
    protected  Set<Empleado> empleado;
    protected  Set<Vehiculo> vehiculo;

    protected Municipio municipio;

    public Mantenimiento(MantenimientoId entityId, Set<TallerId> tallerId, Set<ZonaServicioId> zonaServicioId, Set<JefeArea> jefeArea, Set<Empleado> empleado, Set<Vehiculo> vehiculo, Municipio municipio) {
        super(entityId);
        appendChange(new MantenimientoCreado(tallerId,zonaServicioId,municipio)).apply();
        subscribe(new MantenimientoEventChange(this));
    }

    public Mantenimiento(MantenimientoId entityId) {
        super(entityId);
        subscribe(new MantenimientoEventChange(this));
    }

    public Set<TallerId> getTallerId() {
        return tallerId;
    }

    public Set<ZonaServicioId> getZonaServicioIdSet() {
        return zonaServicioId;
    }

    public Set<JefeArea> getJefeArea() {
        return jefeArea;
    }

    public Set<Empleado> getEmpleado() {
        return empleado;
    }

    public Set<Vehiculo> getVehiculo() {
        return vehiculo;
    }

    public Municipio getMunicipio() {
        return municipio;
    }
}

package co.com.sofkau.epm.mantenimiento.mantenimiento;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.epm.mantenimiento.mantenimiento.values.MantenimientoId;
import co.com.sofkau.epm.mantenimiento.mantenimiento.values.Municipio;
import co.com.sofkau.epm.mantenimiento.taller.values.TallerId;
import co.com.sofkau.epm.mantenimiento.zonaservicio.values.ZonaServicioId;

import java.util.Set;

public class Mantenimiento extends AggregateEvent<MantenimientoId> {

    protected  Set<TallerId> tallerId;
    protected Set<ZonaServicioId> zonaServicioIdSet;
    protected  JefeArea jefeArea;
    protected  Set<Empleado> empleado;
    protected  Set<Vehiculo> vehiculo;

    protected Municipio municipio;

    public Mantenimiento(MantenimientoId entityId) {
        super(entityId);
    }



    public Set<TallerId> getTallerId() {
        return tallerId;
    }

    public Set<ZonaServicioId> getZonaServicioIdSet() {
        return zonaServicioIdSet;
    }

    public JefeArea getJefeArea() {
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

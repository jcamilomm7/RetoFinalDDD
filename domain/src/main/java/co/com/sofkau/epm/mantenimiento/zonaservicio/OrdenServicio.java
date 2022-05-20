package co.com.sofkau.epm.mantenimiento.zonaservicio;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Fecha;
import co.com.sofkau.epm.mantenimiento.zonaservicio.values.OrdenServicioId;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Estado;
import co.com.sofkau.epm.mantenimiento.zonaservicio.values.EmpleadoAsignado;
import co.com.sofkau.epm.mantenimiento.zonaservicio.values.VehiculoAsignado;

import java.util.Set;

public class OrdenServicio extends Entity<OrdenServicioId> {

    protected Fecha fecha;
    protected Set<VehiculoAsignado> vehiculoAsignado;
    protected  Set<EmpleadoAsignado> empleadoAsignado;
    protected Estado estado;
    public OrdenServicio(OrdenServicioId entityId) {
        super(entityId);
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Set<VehiculoAsignado> getVehiculoAsignado() {
        return vehiculoAsignado;
    }

    public Set<EmpleadoAsignado> getEmpleadoAsignado() {
        return empleadoAsignado;
    }

    public Estado getEstado() {
        return estado;
    }
}

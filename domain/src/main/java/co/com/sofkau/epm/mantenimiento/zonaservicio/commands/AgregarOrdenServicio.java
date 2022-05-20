package co.com.sofkau.epm.mantenimiento.zonaservicio.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Estado;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Fecha;
import co.com.sofkau.epm.mantenimiento.zonaservicio.values.EmpleadoAsignado;
import co.com.sofkau.epm.mantenimiento.zonaservicio.values.VehiculoAsignado;

import java.util.Set;


public class AgregarOrdenServicio extends Command {

    private Fecha fecha;
    private Set<VehiculoAsignado> vehiculoAsignado;
    private Set<EmpleadoAsignado> empleadoAsignado;
    private Estado estado;

    public AgregarOrdenServicio(Fecha fecha, Set<VehiculoAsignado> vehiculoAsignado, Set<EmpleadoAsignado> empleadoAsignado, Estado estado) {
        this.fecha = fecha;
        this.vehiculoAsignado = vehiculoAsignado;
        this.empleadoAsignado = empleadoAsignado;
        this.estado = estado;
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

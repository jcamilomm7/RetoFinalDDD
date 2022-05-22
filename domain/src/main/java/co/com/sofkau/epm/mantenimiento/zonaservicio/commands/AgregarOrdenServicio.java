package co.com.sofkau.epm.mantenimiento.zonaservicio.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Estado;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Fecha;
import co.com.sofkau.epm.mantenimiento.zonaservicio.values.EmpleadoAsignado;
import co.com.sofkau.epm.mantenimiento.zonaservicio.values.VehiculoAsignado;
import co.com.sofkau.epm.mantenimiento.zonaservicio.values.ZonaServicioId;

import java.util.Set;


public class AgregarOrdenServicio extends Command {

    private ZonaServicioId zonaServicioId;
    private Fecha fecha;
    private Estado estado;

    public AgregarOrdenServicio(ZonaServicioId zonaServicioId, Fecha fecha, Estado estado) {
        this.zonaServicioId = zonaServicioId;
        this.fecha = fecha;
        this.estado = estado;
    }

    public ZonaServicioId getZonaServicioId() {
        return zonaServicioId;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Estado getEstado() {
        return estado;
    }
}

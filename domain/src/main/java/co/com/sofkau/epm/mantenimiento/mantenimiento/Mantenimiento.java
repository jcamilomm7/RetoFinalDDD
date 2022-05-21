package co.com.sofkau.epm.mantenimiento.mantenimiento;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.epm.mantenimiento.almacen.values.AlmacenId;
import co.com.sofkau.epm.mantenimiento.mantenimiento.events.EmpleadoAgregado;
import co.com.sofkau.epm.mantenimiento.mantenimiento.events.MantenimientoCreado;
import co.com.sofkau.epm.mantenimiento.mantenimiento.events.TallerAgregado;
import co.com.sofkau.epm.mantenimiento.mantenimiento.events.VehiculoAgregado;
import co.com.sofkau.epm.mantenimiento.mantenimiento.values.*;
import co.com.sofkau.epm.mantenimiento.taller.GuiaRecepcion;
import co.com.sofkau.epm.mantenimiento.taller.Jefetaller;
import co.com.sofkau.epm.mantenimiento.taller.PersonalOperativo;
import co.com.sofkau.epm.mantenimiento.taller.events.TallerCreado;
import co.com.sofkau.epm.mantenimiento.taller.values.TallerId;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;
import co.com.sofkau.epm.mantenimiento.zonaservicio.values.ZonaServicioId;

import java.util.Set;

public class Mantenimiento extends AggregateEvent<MantenimientoId> {

    protected TallerId tallerId;
    protected ZonaServicioId zonaServicioId;
    protected  Set<JefeArea> jefeArea;
    protected  Set<Empleado> empleado;
    protected  Set<Vehiculo> vehiculo;

    protected Municipio municipio;

    public Mantenimiento(MantenimientoId entityId, TallerId tallerId, ZonaServicioId zonaServicioId, Set<JefeArea> jefeArea, Set<Empleado> empleado, Set<Vehiculo> vehiculo, Municipio municipio) {
        super(entityId);
        this.tallerId = tallerId;
        this.zonaServicioId = zonaServicioId;
        this.jefeArea = jefeArea;
        this.empleado = empleado;
        this.vehiculo = vehiculo;
        this.municipio = municipio;
    }

    public Mantenimiento(MantenimientoId entityId, TallerId tallerId, ZonaServicioId zonaServicioId, Municipio municipio) {
        super(entityId);
        appendChange(new MantenimientoCreado(tallerId,zonaServicioId,municipio)).apply();
        subscribe(new MantenimientoEventChange(this));
    }


    //Metodos para agregar entidades al agregado de Mantenimiento
    public void agregarEmpleado(Nombre nombre) {
        var empleadoId = new EmpleadoId();
        appendChange(new EmpleadoAgregado(empleadoId,nombre)).apply();
    }

    public void agregarTaller(AlmacenId almacenId, Jefetaller jefetaller, Set<PersonalOperativo> personalOperativo, Set<GuiaRecepcion> guiaRecepcion, Nombre nombre) {
        var tallerId = new TallerId();
        appendChange(new TallerAgregado(tallerId,almacenId,jefetaller,personalOperativo,guiaRecepcion,nombre)).apply();
    }

    public void agregarVehiculo(Tipo tipo, PlanillaMantenimiento planillaMantenimiento) {
        var vehiculoId = new VehiculoId();
        appendChange(new VehiculoAgregado(vehiculoId,tipo,planillaMantenimiento)).apply();
    }


    public TallerId getTallerId() {
        return tallerId;
    }

    public ZonaServicioId getZonaServicioId() {
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

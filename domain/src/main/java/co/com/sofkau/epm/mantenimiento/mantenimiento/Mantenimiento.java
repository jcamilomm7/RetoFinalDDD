package co.com.sofkau.epm.mantenimiento.mantenimiento;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.epm.mantenimiento.mantenimiento.events.EmpleadoAgregado;
import co.com.sofkau.epm.mantenimiento.mantenimiento.events.JefeAreaAgregado;
import co.com.sofkau.epm.mantenimiento.mantenimiento.events.MantenimientoCreado;
import co.com.sofkau.epm.mantenimiento.mantenimiento.events.VehiculoAgregado;
import co.com.sofkau.epm.mantenimiento.mantenimiento.values.*;
import co.com.sofkau.epm.mantenimiento.taller.values.TallerId;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;
import co.com.sofkau.epm.mantenimiento.zonaservicio.values.ZonaServicioId;

import java.util.List;
import java.util.Set;

public class Mantenimiento extends AggregateEvent<MantenimientoId> {

    protected TallerId tallerId;
    protected ZonaServicioId zonaServicioId;
    protected  Set<JefeArea> jefeArea;
    protected  Set<Empleado> empleado;
    protected  Set<Vehiculo> vehiculo;

    protected Municipio municipio;

    public Mantenimiento(MantenimientoId mantenimientoId) {
        super(mantenimientoId);
        subscribe(new MantenimientoEventChange(this));
    }

    public Mantenimiento(MantenimientoId entityId, TallerId tallerId, ZonaServicioId zonaServicioId, Municipio municipio) {
        super(entityId);
        appendChange(new MantenimientoCreado(tallerId, zonaServicioId, municipio)).apply();
        subscribe(new MantenimientoEventChange(this));
    }

    public static Mantenimiento from (MantenimientoId entityId, List<DomainEvent> events){
        var mantenimiento = new Mantenimiento(entityId);
        events.forEach(mantenimiento::applyEvent);
        return mantenimiento;
    }




    //Metodos para agregar entidades al agregado de Mantenimiento
    public void agregarEmpleado(Nombre nombre) {
        var empleadoId = new EmpleadoId();
        appendChange(new EmpleadoAgregado(empleadoId,nombre)).apply();
    }

    public void agregarJefeArea(Nombre nombre) {
        var jefeAreaId = new JefeAreaId();
        appendChange(new JefeAreaAgregado(jefeAreaId,nombre)).apply();
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

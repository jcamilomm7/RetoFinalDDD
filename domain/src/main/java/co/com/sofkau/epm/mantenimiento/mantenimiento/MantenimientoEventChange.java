package co.com.sofkau.epm.mantenimiento.mantenimiento;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.epm.mantenimiento.mantenimiento.events.EmpleadoAgregado;
import co.com.sofkau.epm.mantenimiento.mantenimiento.events.JefeAreaAgregado;
import co.com.sofkau.epm.mantenimiento.mantenimiento.events.MantenimientoCreado;
import co.com.sofkau.epm.mantenimiento.mantenimiento.events.VehiculoAgregado;

import java.util.HashSet;
import java.util.Set;

public class MantenimientoEventChange extends EventChange {

    public MantenimientoEventChange(Mantenimiento mantenimiento) {

        apply((MantenimientoCreado event) -> {
            mantenimiento.municipio= event.getMunicipio(); //Objeto valor
            mantenimiento.tallerId = event.getTallerId();
            mantenimiento.zonaServicioId =event.getZonaServicioId();
            mantenimiento.jefeArea= new HashSet<>();
            mantenimiento.empleado= new HashSet<>();
            mantenimiento.vehiculo= new HashSet<>();
        });



        apply((EmpleadoAgregado event)->{
            var empleadoId = event.getEmpleadoId();
            var empleado=new Empleado(empleadoId, event.getNombre());
            mantenimiento.empleado = (Set<Empleado>) empleado;
        });

        apply((JefeAreaAgregado event)->{
            var jefeAreaId = event.getJefeAreaId();
            var jefeArea=new JefeArea(jefeAreaId, event.getNombre());
            mantenimiento.jefeArea = (Set<JefeArea>) jefeArea;
        });


        apply((VehiculoAgregado event)->{
            var vehiculoId = event.getVehiculoId();
            var vehiculo=new Vehiculo(vehiculoId, event.getTipo(),event.getPlanillaMantenimiento());
            mantenimiento.vehiculo = (Set<Vehiculo>) vehiculo;
        });
    }
}

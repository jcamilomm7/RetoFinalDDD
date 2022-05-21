package co.com.sofkau.epm.mantenimiento.mantenimiento;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.epm.mantenimiento.mantenimiento.events.EmpleadoAgregado;
import co.com.sofkau.epm.mantenimiento.mantenimiento.events.MantenimientoCreado;
import co.com.sofkau.epm.mantenimiento.mantenimiento.events.TallerAgregado;
import co.com.sofkau.epm.mantenimiento.mantenimiento.events.VehiculoAgregado;
import co.com.sofkau.epm.mantenimiento.taller.Taller;
import co.com.sofkau.epm.mantenimiento.taller.events.TallerCreado;
import co.com.sofkau.epm.mantenimiento.taller.values.TallerId;

import java.util.HashSet;
import java.util.Set;

public class MantenimientoEventChange extends EventChange {

    public MantenimientoEventChange(Mantenimiento mantenimiento) {

        apply((MantenimientoCreado event) -> {
            mantenimiento.municipio= event.getMunicipio(); //Objeto valor
            mantenimiento.tallerId = new HashSet<>();
            mantenimiento.zonaServicioId =new HashSet<>();
            mantenimiento.jefeArea= new HashSet<>();
            mantenimiento.empleado= new HashSet<>();
            mantenimiento.vehiculo= new HashSet<>();
        });



        apply((EmpleadoAgregado event)->{
            var empleadoId = event.getEmpleadoId();
            var empleado=new Empleado(empleadoId, event.getNombre());
            mantenimiento.empleado = (Set<Empleado>) empleado;
        });

        apply((TallerAgregado event)->{
            var tallerId = event.getTallerId();
            mantenimiento.tallerId= (Set<TallerId>) tallerId;
        });

        apply((VehiculoAgregado event)->{
            var vehiculoId = event.getVehiculoId();
            var vehiculo=new Vehiculo(vehiculoId, event.getTipo(),event.getPlanillaMantenimiento());
            mantenimiento.vehiculo = (Set<Vehiculo>) vehiculo;
        });
    }
}

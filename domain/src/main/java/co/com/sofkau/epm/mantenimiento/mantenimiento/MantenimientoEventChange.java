package co.com.sofkau.epm.mantenimiento.mantenimiento;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.epm.mantenimiento.mantenimiento.events.EmpleadoAgregado;
import co.com.sofkau.epm.mantenimiento.mantenimiento.events.TallerAgregado;
import co.com.sofkau.epm.mantenimiento.mantenimiento.events.VehiculoAgregado;
import co.com.sofkau.epm.mantenimiento.taller.Taller;
import co.com.sofkau.epm.mantenimiento.taller.values.TallerId;

import java.util.Set;

public class MantenimientoEventChange extends EventChange {

    public MantenimientoEventChange(Mantenimiento mantenimiento) {

        apply((EmpleadoAgregado event)->{
            var empleadoId = event.getEmpleadoId();
            var empleado=new Empleado(empleadoId, event.getNombre());
            mantenimiento.empleado = (Set<Empleado>) empleado;
        });

        apply((TallerAgregado event)->{
            var tallerId = event.getTallerId();
            var taller = new Taller(tallerId, event.getAlmacenId(),event.getJefetaller(),event.getPersonalOperativo(),event.getGuiaRecepcion(),event.getNombre());
            mantenimiento.tallerId= (Set<TallerId>) taller;
        });

        apply((VehiculoAgregado event)->{
            var vehiculoId = event.getVehiculoId();
            var vehiculo=new Vehiculo(vehiculoId, event.getTipo(),event.getPlanillaMantenimiento());
            mantenimiento.vehiculo = (Set<Vehiculo>) vehiculo;
        });
    }
}

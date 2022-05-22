package co.com.sofkau.epm.mantenimiento.mantenimiento;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.epm.mantenimiento.mantenimiento.commands.AgregarEmpleado;
import co.com.sofkau.epm.mantenimiento.mantenimiento.commands.AgregarVehiculo;
import co.com.sofkau.epm.mantenimiento.taller.commands.AgregarJefeTaller;

public class AgregarVehiculoUseCase extends UseCase<RequestCommand<AgregarVehiculo>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AgregarVehiculo> agregarVehiculoRequestCommand) {
        var command = agregarVehiculoRequestCommand.getCommand();
        var mantenimiento = Mantenimiento.from(
                command.getMantenimientoId(), repository().getEventsBy(command.getMantenimientoId().value())
        );

        mantenimiento.agregarVehiculo(command.getTipo(),command.getPlanillaMantenimiento());

        emit().onResponse(new ResponseEvents(mantenimiento.getUncommittedChanges()));
    }

}

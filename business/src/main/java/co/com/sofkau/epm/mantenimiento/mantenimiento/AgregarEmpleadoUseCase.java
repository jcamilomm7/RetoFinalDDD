package co.com.sofkau.epm.mantenimiento.mantenimiento;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.epm.mantenimiento.mantenimiento.commands.AgregarEmpleado;


public class AgregarEmpleadoUseCase extends UseCase<RequestCommand<AgregarEmpleado>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AgregarEmpleado> agregarEmpleadoRequestCommand) {
        var command = agregarEmpleadoRequestCommand.getCommand();
        var mantenimiento = Mantenimiento.from(
                command.getMantenimientoId(), repository().getEventsBy(command.getMantenimientoId().value())
        );

        mantenimiento.agregarEmpleado(command.getNombre());

        emit().onResponse(new ResponseEvents(mantenimiento.getUncommittedChanges()));
    }
}

package co.com.sofkau.epm.mantenimiento.mantenimiento;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.epm.mantenimiento.mantenimiento.commands.AgregarEmpleado;
import co.com.sofkau.epm.mantenimiento.mantenimiento.commands.AgregarJefeArea;
import co.com.sofkau.epm.mantenimiento.taller.commands.AgregarJefeTaller;

public class AgregarJefeAreaUseCase extends UseCase<RequestCommand<AgregarJefeArea>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AgregarJefeArea> agregarJefeAreaRequestCommand) {
        var command = agregarJefeAreaRequestCommand.getCommand();
        var mantenimiento = Mantenimiento.from(
                command.getMantenimientoId(), repository().getEventsBy(command.getMantenimientoId().value())
        );

        mantenimiento.agregarJefeArea(command.getNombre());

        emit().onResponse(new ResponseEvents(mantenimiento.getUncommittedChanges()));
    }
}

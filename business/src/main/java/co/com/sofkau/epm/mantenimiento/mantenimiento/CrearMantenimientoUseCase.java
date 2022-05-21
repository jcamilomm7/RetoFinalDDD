package co.com.sofkau.epm.mantenimiento.mantenimiento;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.epm.mantenimiento.mantenimiento.commands.CrearMantenimiento;

public class CrearMantenimientoUseCase extends UseCase<RequestCommand<CrearMantenimiento>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearMantenimiento> crearMantenimientoRequestCommand) {
        var command = crearMantenimientoRequestCommand.getCommand();

        var mantenimiento = new Mantenimiento(
                command.getMantenimientoId(),
                command.getTallerId(),
                command.getZonaServicioId(),
                command.getMunicipio()
        );

        emit().onResponse(new ResponseEvents(mantenimiento.getUncommittedChanges()));
    }
}

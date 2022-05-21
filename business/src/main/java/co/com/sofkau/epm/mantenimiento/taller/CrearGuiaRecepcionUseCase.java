package co.com.sofkau.epm.mantenimiento.taller;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

import co.com.sofkau.epm.mantenimiento.taller.commands.CrearGuiaRecepcion;

public class CrearGuiaRecepcionUseCase  extends UseCase<RequestCommand<CrearGuiaRecepcion>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearGuiaRecepcion> crearGuiaRecepcionRequestCommand) {
        var command = crearGuiaRecepcionRequestCommand.getCommand();
        var taller = Taller.from(
                command.getTallerId(), repository().getEventsBy(command.getTallerId().value())
        );
        taller.crearGuiaRecepcion(command.getOrdenServicioVeh(), command.getOrdentrabajo(),command.getEstado());

        emit().onResponse(new ResponseEvents(taller.getUncommittedChanges()));
    }

}

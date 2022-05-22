package co.com.sofkau.epm.mantenimiento.taller;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.epm.mantenimiento.taller.commands.AgregarJefeTaller;

public class AgregarJefeTallerUseCase extends UseCase<RequestCommand<AgregarJefeTaller>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AgregarJefeTaller> agregarJefeTallerRequestCommand) {
        var command = agregarJefeTallerRequestCommand.getCommand();
        var taller = Taller.from(
                command.getTallerId(), repository().getEventsBy(command.getTallerId().value())
        );
        taller.agregarJefeTaller(command.getNombre());

        emit().onResponse(new ResponseEvents(taller.getUncommittedChanges()));
    }
}

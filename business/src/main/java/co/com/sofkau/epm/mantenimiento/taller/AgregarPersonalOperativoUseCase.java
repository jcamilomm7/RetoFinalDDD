package co.com.sofkau.epm.mantenimiento.taller;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.epm.mantenimiento.taller.commands.AgregarPersonalOperativo;


public class AgregarPersonalOperativoUseCase extends UseCase<RequestCommand<AgregarPersonalOperativo>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AgregarPersonalOperativo> agregarPersonalOperativoRequestCommand) {
        var command = agregarPersonalOperativoRequestCommand.getCommand();
        var taller = Taller.from(
                command.getTallerId(), repository().getEventsBy(command.getTallerId().value())
        );
        taller.agregarPersonalOperativo(command.getNombre(), command.getHabilidadTecnica());

        emit().onResponse(new ResponseEvents(taller.getUncommittedChanges()));
    }
}

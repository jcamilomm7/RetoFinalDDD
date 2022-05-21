package co.com.sofkau.epm.mantenimiento.taller;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.epm.mantenimiento.taller.commands.CrearTaller;

public class CrearTallerUseCase extends UseCase<RequestCommand<CrearTaller>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearTaller> creartallerRequestCommand) {
        var command = creartallerRequestCommand.getCommand();

        var taller= new Taller(
                command.getTallerId(),
                command.getAlmacenId(),
                command.getNombre()
        );
        emit().onResponse(new ResponseEvents(taller.getUncommittedChanges()));
    }
}

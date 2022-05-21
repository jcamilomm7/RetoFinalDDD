package co.com.sofkau.epm.mantenimiento.almacen;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.epm.mantenimiento.almacen.commands.AgregarInventario;


public class AgregarInventarioUseCase extends UseCase<RequestCommand<AgregarInventario>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AgregarInventario> agregarInventarioRequestCommand) {
        var command = agregarInventarioRequestCommand.getCommand();
        var almacen = Almacen.from(
                command.getAlmacenId(), repository().getEventsBy(command.getAlmacenId().value())
        );
        almacen.agregarInventario(command.getObservaciones(), command.getPlanilla());

        emit().onResponse(new ResponseEvents(almacen.getUncommittedChanges()));
    }
}

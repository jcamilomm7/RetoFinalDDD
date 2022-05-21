package co.com.sofkau.epm.mantenimiento.almacen;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.epm.mantenimiento.almacen.commands.AgregarProveedor;

public class AgregarProveedorUseCase extends UseCase<RequestCommand<AgregarProveedor>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AgregarProveedor> agregarProveedorRequestCommand) {
        var command = agregarProveedorRequestCommand.getCommand();
        var almacen = Almacen.from(
                command.getAlmacenId(), repository().getEventsBy(command.getAlmacenId().value())
        );
        almacen.agregarProveedor(command.getTelefono(), command.getDireccion(),command.getNombre());

        emit().onResponse(new ResponseEvents(almacen.getUncommittedChanges()));

    }
}

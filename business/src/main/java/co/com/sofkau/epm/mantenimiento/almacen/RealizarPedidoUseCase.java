package co.com.sofkau.epm.mantenimiento.almacen;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.epm.mantenimiento.almacen.commands.RealizarPedido;

public class RealizarPedidoUseCase extends UseCase<RequestCommand<RealizarPedido>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<RealizarPedido> realizarPedidoRequestCommand) {
        var command = realizarPedidoRequestCommand.getCommand();
        var almacen = Almacen.from(
                command.getAlmacenId(), repository().getEventsBy(command.getAlmacenId().value())
        );
        almacen.realizarPedido(command.getFecha(), command.getEstado(),command.getProducto(),command.getObservaciones());

        emit().onResponse(new ResponseEvents(almacen.getUncommittedChanges()));
    }
}

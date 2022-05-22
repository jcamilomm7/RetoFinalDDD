package co.com.sofkau.epm.mantenimiento.zonaservicio;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.epm.mantenimiento.zonaservicio.commands.AgregarJefeServicio;
import co.com.sofkau.epm.mantenimiento.zonaservicio.commands.AgregarOrdenServicio;

public class AgregarOrdenServicioUseCase extends UseCase<RequestCommand<AgregarOrdenServicio>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AgregarOrdenServicio> agregarOrdenServicioRequestCommand) {
        var command = agregarOrdenServicioRequestCommand.getCommand();
        var zonaServicio = ZonaServicio.from(
                command.getZonaServicioId(), repository().getEventsBy(command.getZonaServicioId().value())
        );
        zonaServicio.agregarOrdenServicio(command.getFecha(),command.getEstado());

        emit().onResponse(new ResponseEvents(zonaServicio.getUncommittedChanges()));
    }
}

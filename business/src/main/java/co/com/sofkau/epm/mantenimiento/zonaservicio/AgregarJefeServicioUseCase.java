package co.com.sofkau.epm.mantenimiento.zonaservicio;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.epm.mantenimiento.taller.Taller;
import co.com.sofkau.epm.mantenimiento.taller.commands.AgregarJefeTaller;
import co.com.sofkau.epm.mantenimiento.zonaservicio.commands.AgregarJefeServicio;

public class AgregarJefeServicioUseCase extends UseCase<RequestCommand<AgregarJefeServicio>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AgregarJefeServicio> agregarJefeServicioRequestCommand) {
        var command = agregarJefeServicioRequestCommand.getCommand();
        var zonaServicio = ZonaServicio.from(
                command.getZonaServicioId(), repository().getEventsBy(command.getZonaServicioId().value())
        );
        zonaServicio.agregarJefeServicio(command.getNombre());

        emit().onResponse(new ResponseEvents(zonaServicio.getUncommittedChanges()));
    }
}

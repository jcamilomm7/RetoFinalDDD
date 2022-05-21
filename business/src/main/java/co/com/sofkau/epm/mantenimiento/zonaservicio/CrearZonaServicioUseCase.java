package co.com.sofkau.epm.mantenimiento.zonaservicio;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.epm.mantenimiento.zonaservicio.commands.CrearZonaServicio;

public class CrearZonaServicioUseCase extends UseCase<RequestCommand<CrearZonaServicio>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearZonaServicio> crearZonaServicioRequestCommand) {
        var command = crearZonaServicioRequestCommand.getCommand();

        var zonaServicio = new ZonaServicio(
                command.getZonaServicioId(),
                command.getDireccion()
        );

        emit().onResponse(new ResponseEvents(zonaServicio.getUncommittedChanges()));
    }

}

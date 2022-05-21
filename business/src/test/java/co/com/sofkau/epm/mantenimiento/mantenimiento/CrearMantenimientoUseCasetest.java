package co.com.sofkau.epm.mantenimiento.mantenimiento;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofkau.epm.mantenimiento.almacen.CrearAlmacenUseCase;
import co.com.sofkau.epm.mantenimiento.almacen.commands.CrearAlmacen;
import co.com.sofkau.epm.mantenimiento.almacen.events.AlmacenCreado;
import co.com.sofkau.epm.mantenimiento.almacen.values.AlmacenId;
import co.com.sofkau.epm.mantenimiento.almacen.values.Telefono;
import co.com.sofkau.epm.mantenimiento.mantenimiento.commands.CrearMantenimiento;
import co.com.sofkau.epm.mantenimiento.mantenimiento.events.MantenimientoCreado;
import co.com.sofkau.epm.mantenimiento.mantenimiento.values.MantenimientoId;
import co.com.sofkau.epm.mantenimiento.mantenimiento.values.Municipio;
import co.com.sofkau.epm.mantenimiento.taller.values.TallerId;
import co.com.sofkau.epm.mantenimiento.zonaservicio.values.ZonaServicioId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class CrearMantenimientoUseCasetest {

    private CrearMantenimientoUseCase useCase;

    @BeforeEach
    public void setup(){
        useCase = new CrearMantenimientoUseCase();
    }

    @Test
    public void crearMantenimientoHappyPass(){
        //arrange
        var mantenimientoId = MantenimientoId.of("xxxxx");
        var tallerId = TallerId.of("xxxxxsd");
        var zonaServicioId = ZonaServicioId.of("xxxxxdg");
        var municipio = new Municipio("Bello");
        var command = new CrearMantenimiento(mantenimientoId, tallerId,zonaServicioId,municipio);

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //asserts
        var mantenimientoCreado = (MantenimientoCreado)events.get(0);
        Assertions.assertEquals("xxxxx", mantenimientoCreado.aggregateRootId());
        Assertions.assertEquals("Bello", mantenimientoCreado.getMunicipio().value());
    }
}

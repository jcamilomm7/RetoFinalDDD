package co.com.sofkau.epm.mantenimiento.zonaservicio;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;

import co.com.sofkau.epm.mantenimiento.valuesgenericos.Direccion;

import co.com.sofkau.epm.mantenimiento.zonaservicio.commands.CrearZonaServicio;
import co.com.sofkau.epm.mantenimiento.zonaservicio.events.ZonaServicioCreada;
import co.com.sofkau.epm.mantenimiento.zonaservicio.values.ZonaServicioId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CrearZonaServicioUseCaseTest {

    private CrearZonaServicioUseCase useCase;

    @BeforeEach
    public void setup(){
        useCase = new CrearZonaServicioUseCase();
    }

    @Test
    public void crearZonaServicioHappyPass(){
        //arrange
        var zonaServicioId = ZonaServicioId.of("xxxxx");
        var direccion = new Direccion("carrera 63a numero 72-20");
        var command = new CrearZonaServicio( zonaServicioId, direccion);

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //asserts
        var zonaServicioCreada = (ZonaServicioCreada)events.get(0);
        Assertions.assertEquals("xxxxx", zonaServicioCreada.aggregateRootId());
        Assertions.assertEquals("carrera 63a numero 72-20", zonaServicioCreada.getDireccion().value());

    }

}

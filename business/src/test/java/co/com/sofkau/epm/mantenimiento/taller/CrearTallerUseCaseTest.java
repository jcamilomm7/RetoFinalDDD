package co.com.sofkau.epm.mantenimiento.taller;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofkau.epm.mantenimiento.almacen.values.AlmacenId;
import co.com.sofkau.epm.mantenimiento.taller.commands.CrearTaller;
import co.com.sofkau.epm.mantenimiento.taller.events.TallerCreado;
import co.com.sofkau.epm.mantenimiento.taller.values.TallerId;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CrearTallerUseCaseTest {
    private CrearTallerUseCase useCase;

    @BeforeEach
    public void setup(){
        useCase = new CrearTallerUseCase();
    }

    @Test
    public void crearTallerHappyPass(){
        //arrange
        var tallerId = TallerId.of("xxxxx");
        var almacenId = AlmacenId.of("yyyyy");
        var nombre = new Nombre("DDD");
        var command = new CrearTaller( tallerId, almacenId,nombre);

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //asserts
        var tallerCreado = (TallerCreado)events.get(0);
        Assertions.assertEquals("xxxxx", tallerCreado.aggregateRootId());
        Assertions.assertEquals("DDD", tallerCreado.getNombre().value());

    }
}

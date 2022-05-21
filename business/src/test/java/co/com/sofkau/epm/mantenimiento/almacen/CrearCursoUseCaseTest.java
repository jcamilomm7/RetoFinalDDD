package co.com.sofkau.epm.mantenimiento.almacen;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofkau.epm.mantenimiento.almacen.commands.CrearAlmacen;
import co.com.sofkau.epm.mantenimiento.almacen.events.AlmacenCreado;
import co.com.sofkau.epm.mantenimiento.almacen.values.AlmacenId;
import co.com.sofkau.epm.mantenimiento.almacen.values.Telefono;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CrearCursoUseCaseTest {

    private CrearAlmacenUseCase useCase;

    @BeforeEach
    public void setup(){
        useCase = new CrearAlmacenUseCase();
    }

    @Test
    public void crearAlmacenHappyPass(){
        //arrange
        var almacenId = AlmacenId.of("xxxxx");
        var telefono = new Telefono("DDD");
        var command = new CrearAlmacen( almacenId, telefono);

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //asserts
        var almacenCreado = (AlmacenCreado)events.get(0);
        Assertions.assertEquals("xxxxx", almacenCreado.aggregateRootId());
        Assertions.assertEquals("DDD", almacenCreado.getTelefono().value());

    }

}

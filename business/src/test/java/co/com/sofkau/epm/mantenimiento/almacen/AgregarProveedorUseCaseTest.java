package co.com.sofkau.epm.mantenimiento.almacen;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.epm.mantenimiento.almacen.commands.AgregarProveedor;
import co.com.sofkau.epm.mantenimiento.almacen.events.AlmacenCreado;
import co.com.sofkau.epm.mantenimiento.almacen.events.ProveedorAgregado;
import co.com.sofkau.epm.mantenimiento.almacen.values.AlmacenId;
import co.com.sofkau.epm.mantenimiento.almacen.values.Telefono;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Direccion;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
 class AgregarProveedorUseCaseTest {


    @InjectMocks
    private AgregarProveedorUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    void agregarProveedorHappyPass(){
        //arrange
        var almacenId = AlmacenId.of("ddddd");
        var telefono = new Telefono("3245872659");
        var direccion= new Direccion("carrera 63a");
        var nombre= new Nombre("Ana");
        var command = new AgregarProveedor( almacenId,  telefono,  direccion, nombre);

        when(repository.getEventsBy("ddddd")).thenReturn(history());
        useCase.addRepository(repository);
        //act

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(command.getAlmacenId().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (ProveedorAgregado)events.get(0);
        Assertions.assertEquals("3245872659", event.getTelefono().value());
        Assertions.assertEquals("carrera 63a", event.getDireccion().value());
        Assertions.assertEquals("Ana", event.getNombre().value());

    }

    private List<DomainEvent> history() {
        var telefono = new Telefono("DDD");
        var event = new AlmacenCreado(
                telefono);
        event.setAggregateRootId("xxxxx");
        return List.of(event);
    }

}

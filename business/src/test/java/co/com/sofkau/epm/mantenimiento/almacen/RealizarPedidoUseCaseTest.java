package co.com.sofkau.epm.mantenimiento.almacen;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.epm.mantenimiento.almacen.commands.AgregarInventario;
import co.com.sofkau.epm.mantenimiento.almacen.commands.RealizarPedido;
import co.com.sofkau.epm.mantenimiento.almacen.events.AlmacenCreado;
import co.com.sofkau.epm.mantenimiento.almacen.events.InventarioAgregado;
import co.com.sofkau.epm.mantenimiento.almacen.events.PedidoRealizado;
import co.com.sofkau.epm.mantenimiento.almacen.values.AlmacenId;
import co.com.sofkau.epm.mantenimiento.almacen.values.Planilla;
import co.com.sofkau.epm.mantenimiento.almacen.values.Producto;
import co.com.sofkau.epm.mantenimiento.almacen.values.Telefono;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Estado;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Fecha;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Observaciones;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class RealizarPedidoUseCaseTest {
    @InjectMocks
    private RealizarPedidoUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    void realizarPedidoHappyPass(){
        //arrange
        var almacenId = AlmacenId.of("ddddd");
        var fecha = new Fecha(LocalDateTime.now(), LocalDate.now());
        var estado= new Estado("Excelente");
        var producto= new Producto("Motor");
        var observaciones= new Observaciones("Motor diesel");
        var command = new RealizarPedido( almacenId,  fecha, estado,producto,observaciones);

        when(repository.getEventsBy("ddddd")).thenReturn(history());
        useCase.addRepository(repository);
        //act

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(command.getAlmacenId().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (PedidoRealizado)events.get(0);
        Assertions.assertEquals("Excelente", event.getEstado().value());
        Assertions.assertEquals("Motor", event.getProducto().value());
        Assertions.assertEquals("Motor diesel", event.getObservaciones().value());

    }

    private List<DomainEvent> history() {
        var telefono = new Telefono("DDD");
        var event = new AlmacenCreado(
                telefono);
        event.setAggregateRootId("xxxxx");
        return List.of(event);
    }

}

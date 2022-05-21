package co.com.sofkau.epm.mantenimiento.almacen;



import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.epm.mantenimiento.almacen.commands.AgregarInventario;
import co.com.sofkau.epm.mantenimiento.almacen.events.AlmacenCreado;
import co.com.sofkau.epm.mantenimiento.almacen.events.InventarioAgregado;
import co.com.sofkau.epm.mantenimiento.almacen.values.AlmacenId;
import co.com.sofkau.epm.mantenimiento.almacen.values.Planilla;
import co.com.sofkau.epm.mantenimiento.almacen.values.Telefono;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Observaciones;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class AgregarInventarioUseCaseTest {

    @InjectMocks
    private AgregarInventarioUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    void agregarInventarioHappyPass(){
        //arrange
        var almacenId = AlmacenId.of("ddddd");
        var observaciones = new Observaciones("3245872659");
        var planilla= new Planilla("Planilla");
        var command = new AgregarInventario( almacenId,  observaciones,  planilla);

        when(repository.getEventsBy("ddddd")).thenReturn(history());
        useCase.addRepository(repository);
        //act

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(command.getAlmacenId().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (InventarioAgregado)events.get(0);
        Assertions.assertEquals("3245872659", event.getObservaciones().value());
        Assertions.assertEquals("Planilla", event.getPlanilla().value());

    }

    private List<DomainEvent> history() {
        var telefono = new Telefono("DDD");
        var event = new AlmacenCreado(
                telefono);
        event.setAggregateRootId("xxxxx");
        return List.of(event);
    }

}

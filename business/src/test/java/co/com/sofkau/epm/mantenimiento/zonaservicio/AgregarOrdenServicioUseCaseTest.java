package co.com.sofkau.epm.mantenimiento.zonaservicio;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Direccion;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Estado;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Fecha;
import co.com.sofkau.epm.mantenimiento.zonaservicio.commands.AgregarOrdenServicio;
import co.com.sofkau.epm.mantenimiento.zonaservicio.events.OrdenServicioAgregada;
import co.com.sofkau.epm.mantenimiento.zonaservicio.events.ZonaServicioCreada;
import co.com.sofkau.epm.mantenimiento.zonaservicio.values.ZonaServicioId;
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
class AgregarOrdenServicioUseCaseTest {

    @InjectMocks
    private AgregarOrdenServicioUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    void AgregarOrdenServicioHappyPass(){
        //arrange
        var zonaServicioId = ZonaServicioId.of("ddddd");
        var fecha = new Fecha(LocalDateTime.now(), LocalDate.now());
        var estado = new Estado("En proceso");
        var command = new AgregarOrdenServicio( zonaServicioId,  fecha,estado);

        when(repository.getEventsBy("ddddd")).thenReturn(history());
        useCase.addRepository(repository);
        //act

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(command.getZonaServicioId().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (OrdenServicioAgregada)events.get(0);
        Assertions.assertEquals("En proceso", event.getEstado().value());

    }
    private List<DomainEvent> history() {
        var direccion= new Direccion("DDD");
        var event = new ZonaServicioCreada(
                direccion
        );
        event.setAggregateRootId("xxxxx");
        return List.of(event);
    }
}

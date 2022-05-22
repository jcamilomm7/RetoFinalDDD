package co.com.sofkau.epm.mantenimiento.zonaservicio;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Direccion;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;
import co.com.sofkau.epm.mantenimiento.zonaservicio.commands.AgregarJefeServicio;
import co.com.sofkau.epm.mantenimiento.zonaservicio.events.JefeServicioAgregado;
import co.com.sofkau.epm.mantenimiento.zonaservicio.events.ZonaServicioCreada;
import co.com.sofkau.epm.mantenimiento.zonaservicio.values.ZonaServicioId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
 class AgregarJefeServicioUseCaseTest {

    @InjectMocks
    private AgregarJefeServicioUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    void AgregarJefeServicioHappyPass(){
        //arrange
        var zonaServicioId = ZonaServicioId.of("ddddd");
        var nombre = new Nombre("Camilo");
        var command = new AgregarJefeServicio( zonaServicioId,  nombre);

        when(repository.getEventsBy("ddddd")).thenReturn(history());
        useCase.addRepository(repository);
        //act

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(command.getZonaServicioId().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (JefeServicioAgregado)events.get(0);
        Assertions.assertEquals("Camilo", event.getNombre().value());

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

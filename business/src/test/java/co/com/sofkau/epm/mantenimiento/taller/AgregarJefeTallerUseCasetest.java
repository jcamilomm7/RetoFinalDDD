package co.com.sofkau.epm.mantenimiento.taller;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.epm.mantenimiento.almacen.values.AlmacenId;
import co.com.sofkau.epm.mantenimiento.taller.commands.AgregarJefeTaller;
import co.com.sofkau.epm.mantenimiento.taller.events.JefeTallerAgregado;
import co.com.sofkau.epm.mantenimiento.taller.events.TallerCreado;
import co.com.sofkau.epm.mantenimiento.taller.values.TallerId;
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
class AgregarJefeTallerUseCasetest {

    @InjectMocks
    private AgregarJefeTallerUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    void agregarJefeTallerHappyPass(){
        //arrange
        var tallerId = TallerId.of("ddddd");
        var nombre = new Nombre("Julian");
        var command = new AgregarJefeTaller( tallerId,  nombre);

        when(repository.getEventsBy("ddddd")).thenReturn(history());
        useCase.addRepository(repository);
        //act

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(command.getTallerId().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (JefeTallerAgregado)events.get(0);
        Assertions.assertEquals("Julian", event.getNombre().value());
    }
    private List<DomainEvent> history() {
        var nombre = new Nombre("DDD");
        var almacenId = AlmacenId.of("dddd");
        var event = new TallerCreado(
                nombre,
                almacenId);
        event.setAggregateRootId("xxxxx");
        return List.of(event);
    }


}

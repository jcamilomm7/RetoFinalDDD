package co.com.sofkau.epm.mantenimiento.mantenimiento;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.epm.mantenimiento.mantenimiento.commands.AgregarEmpleado;
import co.com.sofkau.epm.mantenimiento.mantenimiento.commands.AgregarVehiculo;
import co.com.sofkau.epm.mantenimiento.mantenimiento.events.EmpleadoAgregado;
import co.com.sofkau.epm.mantenimiento.mantenimiento.events.MantenimientoCreado;
import co.com.sofkau.epm.mantenimiento.mantenimiento.events.VehiculoAgregado;
import co.com.sofkau.epm.mantenimiento.mantenimiento.values.MantenimientoId;
import co.com.sofkau.epm.mantenimiento.mantenimiento.values.Municipio;
import co.com.sofkau.epm.mantenimiento.mantenimiento.values.PlanillaMantenimiento;
import co.com.sofkau.epm.mantenimiento.mantenimiento.values.Tipo;
import co.com.sofkau.epm.mantenimiento.taller.values.TallerId;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Nombre;
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
 class AgregarVehiculoUseCaseTest {

 @InjectMocks
 private AgregarVehiculoUseCase useCase;

 @Mock
 private DomainEventRepository repository;

 @Test
 void agregarVehiculoHappyPass(){
  //arrange
  var mantenimientoId = MantenimientoId.of("ddddd");
  var tipo = new Tipo("Vactor doble troque");
  var planillaMantenimiento = new PlanillaMantenimiento("Planilla");
  var command = new AgregarVehiculo( mantenimientoId,  tipo, planillaMantenimiento);

  when(repository.getEventsBy("ddddd")).thenReturn(history());
  useCase.addRepository(repository);
  //act

  var events = UseCaseHandler.getInstance()
          .setIdentifyExecutor(command.getMantenimientoId().value())
          .syncExecutor(useCase, new RequestCommand<>(command))
          .orElseThrow()
          .getDomainEvents();

  //assert
  var event = (VehiculoAgregado)events.get(0);
  Assertions.assertEquals("Vactor doble troque", event.getTipo().value());
  Assertions.assertEquals("Planilla", event.getPlanillaMantenimiento().value());
 }
 private List<DomainEvent> history() {
  var municipio = new Municipio("DDD");
  var tallerId = TallerId.of("dddd");
  var zonaServicioId = ZonaServicioId.of("dddd");
  var event = new MantenimientoCreado(
          tallerId,
          zonaServicioId,
          municipio);
  event.setAggregateRootId("xxxxx");
  return List.of(event);
 }
}

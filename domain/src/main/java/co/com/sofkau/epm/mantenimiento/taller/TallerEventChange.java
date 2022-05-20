package co.com.sofkau.epm.mantenimiento.taller;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.epm.mantenimiento.almacen.Inventario;
import co.com.sofkau.epm.mantenimiento.taller.events.GuiaRecepcionCreada;

import java.util.Set;

public class TallerEventChange extends EventChange {

    public TallerEventChange(Taller taller) {

        apply((GuiaRecepcionCreada event)->{
            var guiaRecepcionId = event.getGuiaRecepcionId();
            var guiaRecepcion =new GuiaRecepcion(guiaRecepcionId, event.getOrdenServicioVeh(),event.getOrdentrabajo(),event.getEstado());
            taller.guiaRecepcion = (Set<GuiaRecepcion>) guiaRecepcion;
        });
    }
}

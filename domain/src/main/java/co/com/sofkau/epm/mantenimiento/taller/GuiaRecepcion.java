package co.com.sofkau.epm.mantenimiento.taller;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.epm.mantenimiento.taller.values.GuiaRecepcionId;
import co.com.sofkau.epm.mantenimiento.taller.values.OrdenServicioVeh;
import co.com.sofkau.epm.mantenimiento.taller.values.Ordentrabajo;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Estado;

public class GuiaRecepcion extends Entity<GuiaRecepcionId> {

    protected OrdenServicioVeh ordenServicioVeh;
    protected Ordentrabajo ordentrabajo;
    protected Estado estado;

    public GuiaRecepcion(GuiaRecepcionId entityId) {
        super(entityId);
    }

    public OrdenServicioVeh getOrdenServicioVeh() {
        return ordenServicioVeh;
    }

    public Ordentrabajo getOrdentrabajo() {
        return ordentrabajo;
    }

    public Estado getEstado() {
        return estado;
    }
}

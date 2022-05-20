package co.com.sofkau.epm.mantenimiento.taller.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.epm.mantenimiento.taller.values.OrdenServicioVeh;
import co.com.sofkau.epm.mantenimiento.taller.values.Ordentrabajo;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Estado;

public class CrearGuiaRecepcion extends Command {

    private OrdenServicioVeh ordenServicioVeh;
    private Ordentrabajo ordentrabajo;
    private Estado estado;

    public CrearGuiaRecepcion(OrdenServicioVeh ordenServicioVeh, Ordentrabajo ordentrabajo, Estado estado) {
        this.ordenServicioVeh = ordenServicioVeh;
        this.ordentrabajo = ordentrabajo;
        this.estado = estado;
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

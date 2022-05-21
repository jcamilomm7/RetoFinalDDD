package co.com.sofkau.epm.mantenimiento.taller.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.epm.mantenimiento.taller.values.GuiaRecepcionId;
import co.com.sofkau.epm.mantenimiento.taller.values.OrdenServicioVeh;
import co.com.sofkau.epm.mantenimiento.taller.values.Ordentrabajo;
import co.com.sofkau.epm.mantenimiento.taller.values.TallerId;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Estado;

public class CrearGuiaRecepcion extends Command {

    private TallerId tallerId;
    private OrdenServicioVeh ordenServicioVeh;
    private Ordentrabajo ordentrabajo;
    private Estado estado;


    public CrearGuiaRecepcion(TallerId tallerId, OrdenServicioVeh ordenServicioVeh, Ordentrabajo ordentrabajo, Estado estado) {
        this.tallerId = tallerId;
        this.ordenServicioVeh = ordenServicioVeh;
        this.ordentrabajo = ordentrabajo;
        this.estado = estado;
    }



    public TallerId getTallerId() {
        return tallerId;
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

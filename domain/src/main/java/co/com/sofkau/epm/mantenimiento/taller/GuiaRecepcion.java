package co.com.sofkau.epm.mantenimiento.taller;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.epm.mantenimiento.taller.values.GuiaRecepcionId;
import co.com.sofkau.epm.mantenimiento.taller.values.OrdenServicioVeh;
import co.com.sofkau.epm.mantenimiento.taller.values.Ordentrabajo;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Estado;

import java.util.Objects;

public class GuiaRecepcion extends Entity<GuiaRecepcionId> {

    protected OrdenServicioVeh ordenServicioVeh;
    protected Ordentrabajo ordentrabajo;
    protected Estado estado;
    private GuiaRecepcion guiaRecepcion;

    public GuiaRecepcion(GuiaRecepcionId entityId, OrdenServicioVeh ordenServicioVeh, Ordentrabajo ordentrabajo, Estado estado) {
        super(entityId);
        this.ordenServicioVeh = ordenServicioVeh;
        this.ordentrabajo = ordentrabajo;
        this.estado = estado;
    }



    //Se crea entidad dentro de la misma entidad
    public void crearGuiaRecepcion (GuiaRecepcion guiaRecepcion){
       this.guiaRecepcion = guiaRecepcion;
    }


    //Modificamos objeto valor dentro de entidad
    public void actualizarEstado (Estado estado){
        this.estado = Objects.requireNonNull(estado);
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

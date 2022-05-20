package co.com.sofkau.epm.mantenimiento.almacen.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Fecha;
import co.com.sofkau.epm.mantenimiento.almacen.values.PedidoId;
import co.com.sofkau.epm.mantenimiento.almacen.values.Producto;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Estado;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Observaciones;

import java.util.Set;

public class PedidoRealizado extends DomainEvent {

    private final PedidoId pedidoId;
    private final Fecha fecha;
    private final Estado estado;
    private final Set<Producto> producto;
    private final Observaciones observaciones;

    public PedidoRealizado(PedidoId pedidoId, Fecha fecha, Estado estado, Set<Producto> producto, Observaciones observaciones) {
        super("co.com.sofkau.epm.mantenimiento.almacen.events.PedidoRealizado");
        this.pedidoId = pedidoId;
        this.fecha = fecha;
        this.estado = estado;
        this.producto = producto;
        this.observaciones = observaciones;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Estado getEstado() {
        return estado;
    }

    public Set<Producto> getProducto() {
        return producto;
    }

    public Observaciones getObservaciones() {
        return observaciones;
    }
}

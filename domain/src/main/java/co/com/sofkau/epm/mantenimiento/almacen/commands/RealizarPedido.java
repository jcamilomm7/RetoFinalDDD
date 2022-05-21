package co.com.sofkau.epm.mantenimiento.almacen.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.epm.mantenimiento.almacen.values.PedidoId;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Fecha;
import co.com.sofkau.epm.mantenimiento.almacen.values.Producto;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Estado;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Observaciones;

import java.util.Set;

public class RealizarPedido extends Command {

    private PedidoId pedidoId;
    private Fecha fecha;
    private Estado estado;
    private Set<Producto> producto;
    private Observaciones observaciones;

    public RealizarPedido(PedidoId pedidoId, Fecha fecha, Estado estado, Set<Producto> producto, Observaciones observaciones) {
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

package co.com.sofkau.epm.mantenimiento.almacen;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.epm.mantenimiento.almacen.values.PedidoId;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Estado;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Fecha;
import co.com.sofkau.epm.mantenimiento.almacen.values.Producto;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Observaciones;

import java.util.Set;

public class Pedido extends Entity<PedidoId> {

    protected Fecha fecha;
    protected Estado estado;
    protected Producto producto;
    protected Observaciones observaciones;

    public Pedido(PedidoId entityId, Fecha fecha, Estado estado, Producto producto, Observaciones observaciones) {
        super(entityId);
        this.fecha = fecha;
        this.estado = estado;
        this.producto = producto;
        this.observaciones = observaciones;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Estado getEstado() {
        return estado;
    }

    public Producto getProducto() {
        return producto;
    }

    public Observaciones getObservaciones() {
        return observaciones;
    }
}

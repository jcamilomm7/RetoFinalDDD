package co.com.sofkau.epm.mantenimiento.almacen;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.epm.mantenimiento.almacen.values.AlmacenId;

import java.util.Set;

public class Almacen extends AggregateEvent<AlmacenId> {

    protected Set<Pedido> pedido;
    protected Set<Proveedor> proveedor;
    protected Set<Inventario> inventario;

    public Almacen(AlmacenId entityId) {
        super(entityId);
    }

    public Set<Pedido> getPedido() {
        return pedido;
    }

    public Set<Proveedor> getProveedor() {
        return proveedor;
    }

    public Set<Inventario> getInventario() {
        return inventario;
    }
}

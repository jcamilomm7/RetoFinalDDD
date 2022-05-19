package co.com.sofkau.iupb.facultad.almacen;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.iupb.facultad.almacen.values.AlmacenId;

import java.util.Set;

public class Almacen extends AggregateEvent<AlmacenId> {

    protected Set<Pedido> pedido;
    protected Set<Proveedor> proveedor;
    protected Set<Inventario> inventario;

    public Almacen(AlmacenId entityId) {
        super(entityId);
    }
}

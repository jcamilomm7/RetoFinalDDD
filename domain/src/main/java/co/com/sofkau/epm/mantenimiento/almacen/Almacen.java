package co.com.sofkau.epm.mantenimiento.almacen;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.epm.mantenimiento.almacen.events.AlmacenCreado;
import co.com.sofkau.epm.mantenimiento.almacen.events.InventarioAgregado;
import co.com.sofkau.epm.mantenimiento.almacen.events.PedidoRealizado;
import co.com.sofkau.epm.mantenimiento.almacen.events.ProveedorAgregado;
import co.com.sofkau.epm.mantenimiento.almacen.values.*;

import co.com.sofkau.epm.mantenimiento.valuesgenericos.*;

import java.util.Set;

public class Almacen extends AggregateEvent<AlmacenId> {

    protected Set<Pedido> pedido;
    protected Set<Proveedor> proveedor;
    protected Set<Inventario> inventario;

    protected Telefono telefono;

    public Almacen(AlmacenId entityId, Telefono telefono) {
        super(entityId);
        appendChange(new AlmacenCreado(telefono)).apply();
        subscribe(new AlmacenEventChange(this));
    }
    public Almacen(AlmacenId entityId) {
        super(entityId);
        subscribe(new AlmacenEventChange(this));
    }

    public void agregarInventario( Observaciones observaciones, Planilla planilla) {
        var inventarioId = new InventarioId();
        appendChange(new InventarioAgregado(inventarioId,observaciones,planilla)).apply();
    }

    public void agregarProveedor(Telefono telefono, Direccion direccion, Nombre nombre) {
        var proveedorId = new ProveedorId();
        appendChange(new ProveedorAgregado(proveedorId,telefono,direccion,nombre)).apply();
    }

    public void realizarPedido(Fecha fecha, Estado estado, Producto producto, Observaciones observaciones) {
        var pedidoId = new PedidoId();
        appendChange(new PedidoRealizado(pedidoId,fecha,estado,producto,observaciones)).apply();
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

    public Telefono getTelefono() {
        return telefono;
    }
}

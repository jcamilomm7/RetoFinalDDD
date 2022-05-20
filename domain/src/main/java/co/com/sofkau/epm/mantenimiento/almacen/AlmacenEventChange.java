package co.com.sofkau.epm.mantenimiento.almacen;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.epm.mantenimiento.almacen.events.InventarioAgregado;
import co.com.sofkau.epm.mantenimiento.almacen.events.PedidoRealizado;
import co.com.sofkau.epm.mantenimiento.almacen.events.ProveedorAgregado;
import co.com.sofkau.epm.mantenimiento.zonaservicio.OrdenServicio;
import co.com.sofkau.epm.mantenimiento.zonaservicio.events.OrdenServicioAgregada;

import java.util.Set;

public class AlmacenEventChange extends EventChange {

    public AlmacenEventChange(Almacen almacen) {

        apply((InventarioAgregado event)->{
            var inventarioId = event.getInventarioId();
            var inventario =new Inventario(inventarioId, event.getObservaciones(),event.getPlanilla());
            almacen.inventario = (Set<Inventario>) inventario;
        });

        apply((ProveedorAgregado event)->{
            var proveedorId = event.getProveedorId();
            var proveedor =new Proveedor(proveedorId, event.getTelefono(),event.getDireccion(),event.getNombre());
            almacen.proveedor = (Set<Proveedor>) proveedor;
        });

        apply((PedidoRealizado event)->{
            var pedidoId = event.getPedidoId();
            var pedido =new Pedido(pedidoId, event.getFecha(),event.getEstado(),event.getProducto(),event.getObservaciones());
            almacen.pedido = (Set<Pedido>) pedido;
        });
    }
}
